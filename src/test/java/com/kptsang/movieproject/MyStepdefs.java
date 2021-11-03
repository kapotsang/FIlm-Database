package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
     private String Title;
     private String actualTitle;
     Film2 cukeFilm = new Film2("ACADEMY DINOSAUR", 1);

    @Given("ACADEMY DINOSAUR is in the library")
    public void academyDinosaurIsInLibrary() {Title = "ACADEMY DINOSAUR";
    }

    @When("I search for ACADEMY DINOSAUR")
    public void searchAcademyDinosaur() {actualTitle = cukeFilm.getTitle();
    }

    @Then("I should be told {string} is available")
    public void iShouldBeToldDino(String expectedAnswer) {assertEquals(expectedAnswer, actualTitle);
    }

    @Given ("ACADEMY DOG is not in the library")
    public void academyDogIsInLibrary(){Title ="ACADEMY DOG";}

    @When ("I search for ACADEMY DOG")
    public void searchAcademyDog(){actualTitle = cukeFilm.getTitle();
    }
    @Then("I should be told {string} is not available")
    public void iShouldBeToldDog(String expectedAnswer) {assertEquals(expectedAnswer, actualTitle);}


}
