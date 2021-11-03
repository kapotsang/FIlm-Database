package com.kptsang.movieproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@SpringBootApplication
@RestController //@RequestMapping ("/all")
public class MovieprojectApplication {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private ActorRepository actorRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieprojectApplication.class, args);
	}

    @GetMapping("/allFilms")
    public @ResponseBody Iterable<Film2> getAllFilms(){
        return filmRepository.findAll();
    }

    @GetMapping("/searchID")
    public @ResponseBody Optional<Film2> getSearch(){return filmRepository.findById(12);}

    @GetMapping("/allActors")
    public @ResponseBody Iterable<Actor> getAllActors() {return actorRepository.findAll();}

    @GetMapping("/searchActorID")
        public @ResponseBody Optional<Actor> getSearchActor(){return actorRepository.findById(3);}

    @GetMapping("/searchFilm/{film_id}")
        public @ResponseBody Film2 findById(@PathVariable("film_id") int film_id){
        Film2 searchFilm = filmRepository.findById(film_id).orElse(null);
        return searchFilm;
    }

    @PostMapping("/newActor")
    public @ResponseBody String newActor (@RequestParam int actor_id, @RequestParam String first_name, @RequestParam String last_name, @RequestParam String last_update){
        Actor savedActor = new Actor(actor_id, first_name, last_name, last_update);
        actorRepository.save(savedActor);
        return "Saved Actor";
    }

    @DeleteMapping("/deleteActor{actor_id}")
    public String deleteActor(@PathVariable ("actor_id")int actor_id){
         actorRepository.deleteById(actor_id);
    return "Actor deleted";
    }

    @PostMapping("/newFilm")
    public @ResponseBody String newFilm (  @RequestParam String title)
    {
        Film2 savedFilm = new Film2 (title);
        filmRepository.save(savedFilm);
        return "Saved Film";
    }

/*	@GetMapping("/getFilm")
	public String filmResponse(){
		Film film1 = new Film("The Shining", 144,"Jack Nicholson");
		return film1.getJsonObjectOfFilm();
	} */
}
