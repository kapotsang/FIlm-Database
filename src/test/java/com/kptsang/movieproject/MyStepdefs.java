package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.kptsang.movieproject.*;



public class MyStepdefs {
    @Autowired
    private FilmRepository testFilmRepository;

    Film2 testFilmShining = new Film2("The Shining", 1);


    @Given("The Shining is in the database")
    public void shiningInLibrary(){ testFilmRepository.save(testFilmShining);
    }
    @Given("The Shooping is not in the database")


    @When("I search for The Shining")
    public void searchForTheShining() { testFilmShining.getTitle();
        //locate title to confirm presence

    }

    @Then("I should be told The Shining is available")
    public void shouldBeToldShiningAvailable() {
        //confirmation of title in database
    }



/*     private String Title;
     private String actualTitle;
     Film2 testFilm2 = new Film2("The Shining", 1);

    @Given("The Shining is in the database")
    public void academyDinosaurIsInLibrary() {Title = "The Shining";
    }

    @When("I search for The Shining")
    public void searchAcademyDinosaur() {actualTitle = testFilm2.getTitle();
    }


    @Then("I should be told The Shining is available")

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

*/
}
