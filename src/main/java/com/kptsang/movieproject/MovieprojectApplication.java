package com.kptsang.movieproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping ("/all")
public class MovieprojectApplication {

    @Autowired
    private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieprojectApplication.class, args);
	}

    @GetMapping("/films")
    public @ResponseBody Iterable<Film> getAllFilms(){
        return filmRepository.findAll();
    }

    @GetMapping("/search")
    public @ResponseBody Optional<Film> getSearch(){return filmRepository.findById(12);}

    @PostMapping("/newFilm")
    public @ResponseBody String addFilm (@RequestParam String title ,@RequestParam int length, @RequestParam int release_year) {
        Film savedFilm = new Film(title, length, release_year);
        filmRepository.save(savedFilm);
        return "Saved";
    }

    //@GetMapping("/delete")



/*	@GetMapping("/getFilm")
	public String filmResponse(){
		Film film1 = new Film("The Shining", 144,"Jack Nicholson");
		return film1.getJsonObjectOfFilm();
	} */
}
