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
    public @ResponseBody Iterable<Film> getAllFilms(){
        return filmRepository.findAll();
    }

    @GetMapping("/searchID")
    public @ResponseBody Optional<Film> getSearch(){return filmRepository.findById(12);}

    @GetMapping("/allActors")
    public @ResponseBody Iterable<Actor> getAllActors() {return actorRepository.findAll();}

    @GetMapping("/searchActorID")
        public @ResponseBody Optional<Actor> getSearchActor(){return actorRepository.findById(3);}

    @PostMapping("/newFilm")
    public @ResponseBody String addFilm (@RequestParam int film_id, @RequestParam String title ,@RequestParam int length, @RequestParam int release_year) {
        Film savedFilm = new Film ( film_id,title, length, release_year);
        filmRepository.save(savedFilm);
        return "Saved Film";
    }

    @PostMapping("/newActor")
    public @ResponseBody String addActor (@RequestParam int actor_id, @RequestParam String first_name, @RequestParam String last_name, @RequestParam String last_update){
        Actor savedActor = new Actor(actor_id, first_name, last_name, last_update);
        actorRepository.save(savedActor);
        return "Saved Actor";

    }

    /*@GetMapping("/deleteEntry")
    public @ResponseBody Optional<Film> deleteFilm(){return filmRepository.deleteById(12);}


   /* @DeleteMapping("remove/id")
    public String remove@PathVariable String id){
    filmRepository.deleteById(id){
        return "Entry deleted";
        }
    }


   /* @PostMapping("/deleteFilm")
    public @ResponseBody String deleteFilm (@RequestParam String title, @RequestParam int length, @RequestParam int release_year){
        Film deletedFilm = new Film(title, length, release_year );
        filmRepository.delete(deletedFilm);
        return "Deleted";

    }

    @PostMapping("/newReview")
    Film film_inDB = filmRepository.findById(film).get();
    film_inDB.setTitle()*/



    //@GetMapping("/delete")
    //@GetMapping("/review")



/*	@GetMapping("/getFilm")
	public String filmResponse(){
		Film film1 = new Film("The Shining", 144,"Jack Nicholson");
		return film1.getJsonObjectOfFilm();
	} */
}
