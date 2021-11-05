/*package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MyStepdefs {
    @Autowired
    private FilmRepository testFilmRepository;

    Film2 testFilmShining = new Film2("The Shining", 1);
    private String shiningAnswer;
    Film2 testFilmDino = new Film2("ACADEMY DINOSAUR", 1);


    @Given("ACADEMY DINOSAUR is in the database")
    public void dinoInDB(){ testFilmRepository.save(testFilmDino);  //get title
    }

    @When("I search for ACADEMY DINOSAUR")
    public void searchForDino() { testFilmDino.getTitle();     //search by title
    }


*/
/*
    @Then("I should be told ACADEMY DINOSAUR is available")
    public void shouldBeToldShiningAvailable(String expectedAnswerDino ){   //confirmation
        assertEquals();
    }

    // @Given("The Shining is not in the database")
    // public void shiningInDB(){testFilmRepository.save(testFilmShining);
    // }
    //   @When("I search for The Shining")
    //   public void searchForShining(){testFilmShining.getTitle();
    //  }

    //   @Then("I should be told The Shining is not available")
  //  public void shouldBeToldShiningNotAvailable(String expectedAnswer){

    }
        //confirmation of title in database




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
