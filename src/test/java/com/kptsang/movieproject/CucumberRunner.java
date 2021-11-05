package com.kptsang.movieproject;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src/test/java/com/kptsang/movieproject" )
public class CucumberRunner {


}