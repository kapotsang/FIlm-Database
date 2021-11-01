package com.kptsang.movieproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class MovieprojectApplication {

    @Autowired
    private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieprojectApplication.class, args);
	}

    @GetMapping("/all")
    public @ResponseBody Iterable<Film> getAllUsers(){
        return filmRepository.findAll();
    }


/*	@GetMapping("/getFilm")
	public String filmResponse(){
		Film film1 = new Film("The Shining", 144,"Jack Nicholson");
		return film1.getJsonObjectOfFilm();
	} */
}
