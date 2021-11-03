package com.kptsang.movieproject;
import javax.persistence.*;


@Entity
@Table (name="film")
public class Film2 {
    @Id
    private int film_id;
    private String title;
    private int language_id;
  // private String description;


    public Film2(int film_id, String title){
        this.film_id=film_id;
        this.title=title;
        this.language_id=language_id;
    //    this.description=description;
    }
    public Film2(){

    }
    public void setFilm_id(int film_id){
        this.film_id = film_id;
    }
    public int getFilm_id(){
        return film_id;
    }
    public void setTitle(String title){this.title = title;}
    public String getTitle(){
        return title;
    }


   public void setLanguage_id(int language_id){
        this.language_id=language_id;
    } /*
    public int getLanguage_id(){return language_id;}
    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}*/
}
