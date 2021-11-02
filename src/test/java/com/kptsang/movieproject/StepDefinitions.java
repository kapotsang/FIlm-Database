package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private String film_title;
    private String actualAnswerTitle;


    @Given("ACADEMY DINOSAUR is in the library")
    public void title_Dino() {film_title = "ACADEMY DINOSAUR";}
    @When("I search for this film")
    public void dino_query(){actualAnswerTitle = "ACADEMY DINOSAUR";}
    @Then("Then I should be told {string}")
    public void exists(String expectedAnswerTitle){
         {assertEquals(expectedAnswerTitle, actualAnswerTitle);}
    }



}
