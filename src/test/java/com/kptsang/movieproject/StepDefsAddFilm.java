package com.kptsang.movieproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefsAddFilm {

    @Autowired
    private FilmRepository testFilmRepository;
}
