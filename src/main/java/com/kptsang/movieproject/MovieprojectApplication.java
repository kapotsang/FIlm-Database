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
    private ActorRepository actorRepository;
    @Autowired
    private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieprojectApplication.class, args);
	}

    @GetMapping("/allFilms")
    public @ResponseBody Iterable<Film2> getAllFilms(){
        return filmRepository.findAll();
    }

  //  @GetMapping("/searchID")
   // public @ResponseBody Optional<Film2> getSearch(){return filmRepository.findById(12);}

    @GetMapping("/allActors")
    public @ResponseBody Iterable<Actor> getAllActors() {return actorRepository.findAll();}

    @GetMapping("/searchActorID")
        public @ResponseBody Optional<Actor> getSearchActor(){return actorRepository.findById(3);}

    @GetMapping("/searchFilm/{film_id}")
        public @ResponseBody Film2 findById(@PathVariable("film_id") int film_id){
        Film2 searchFilm = filmRepository.findById(film_id).orElse(null);
        return searchFilm;
    }
    @PostMapping("/newFilm")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody String newFilm ( @RequestParam String title, @RequestParam int language_id) {
        Film2 savedFilm = new Film2( title, language_id);
        filmRepository.save(savedFilm);
        return "Saved Film";
    }

    @DeleteMapping("/deleteFilm{film_id}")
    public String deleteFilm(@PathVariable ("film_id")int film_id){
        filmRepository.deleteById(film_id);
        return "Film deleted"
        ;
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

  /*  @PutMapping("/filmUpdate")
    public Film2 filmUpdate(@RequestBody Film2 film){
        filmRepository.save(film);
        return "Film updated";
    }
*/

}
