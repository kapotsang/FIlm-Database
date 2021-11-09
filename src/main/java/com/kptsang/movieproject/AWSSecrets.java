package com.kptsang.movieproject;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AWSSecrets {
    private String username;
    private String password;
    private String host;
    private String engine;
    private String port;
    private String dbInstanceIdentifier;
}
