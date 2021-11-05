package com.kptsang.movieproject;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name="film")
public class Film2 {
    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int film_id;
    private String title;
    private int language_id;



    public Film2(  String title, int language_id){
       this.film_id=film_id;
        this.title=title;
        this.language_id=language_id;

    }
    public Film2(){

    }
   public void setFilm_id(int film_id){
        this.film_id = film_id;
    }
    public int getFilm_id(){
        return film_id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
   public void setLanguage_id(int language_id){
        this.language_id=language_id;
    }
    public int getLanguage_id(){
        return language_id;
    }

}
