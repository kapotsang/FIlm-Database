package com.kptsang.movieproject;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.*;
import org.springframework.context.annotation.Configuration;
//import org.apache.velocity.exception.ResourceNotFoundException;
import java.security.InvalidParameterException;
import java.util.Base64;
import com.google.gson.Gson;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;

@Configuration
public class ApplicationConfig {
    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;
    @Value("${cloud.aws.credentials.secret-key}")
    private String secretkey;

    private Gson gson=new Gson();

    @Bean
    public DataSource datasource(){
        AWSSecrets secrets=getSecret();
        return DataSourceBuilder
                .create()
              //  .driverClassName("com.mysql.cj.jbdc.driver")
                .url("jdbc:mysql://tsidatabase1.cbpghhowmowd.us-east-1.rds.amazonaws.com:3306/sakila?useSSL=false&serverTimezone=UTC")
                .username(secrets.getUsername())
                .password(secrets.getPassword())
                .build();
    }

    private AWSSecrets getSecret() {

        String secretName = "TestingDB";
        String region = "us-east-1";

        // Create a Secrets Manager client
        AWSSecretsManager client  = AWSSecretsManagerClientBuilder.standard()
                .withRegion(region)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretkey)))
                .build();

        String secret, decodedBinarySecret;
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);
        GetSecretValueResult getSecretValueResult = null;

        try {
            getSecretValueResult = client.getSecretValue(getSecretValueRequest);
        } catch (Exception e) {
            // Secrets Manager can't decrypt the protected secret text using the provided KMS key.
            // Deal with the exception here, and/or rethrow at your discretion.
            throw e;
        }


        if (getSecretValueResult.getSecretString() != null) {
            secret = getSecretValueResult.getSecretString();
            return gson.fromJson(secret,AWSSecrets.class);
        }
        return null;

    }
}
