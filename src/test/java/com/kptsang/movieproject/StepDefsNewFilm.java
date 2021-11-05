package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefsNewFilm {

    @Autowired
    private FilmRepository testFilmRepository;
    Film2 testFilmDino = new Film2 ("ACADEMY DONUT", 1);
    Film2 testFilmDonut = new Film2 ("ACADEMY DINOSAUR", 1);

    public void saveTestFilm() {
        testFilmRepository.save(testFilmDino);
    }

    @Given("ACADEMY DONUT is not in the database")
    public void donutNotIn(){ //how to confirm film isn't in databse?
    }
    @When("I add ACADEMY DONUT")
    public void donutAdd(){
        testFilmRepository.save(testFilmDonut);
    }
    @Then("{string} should be added to the database")
    public void donutConfirm(String expectedAnswerDonut){ //how to confirm without it being the same as film search?


    }
}
