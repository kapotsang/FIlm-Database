package com.kptsang.movieproject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int film_id;
    private String title;
    private int length;
    private int release_year;
    private int language_id;

    public Film(int film_id, String title, int length, int release_year){
        this.film_id=film_id;
        this.title = title;
        this.length = length;
        this.release_year = release_year;
        this.language_id = language_id;


    }
    public Film(){

    }
    public void setFilm_id(int film_id){this.film_id = film_id;}
    public int getFilm_id(){return film_id;}
    public void setTitle(String title){this.title = title;}
    public String getTitle(){return title;}
    public void setLength(int length){this.length = length;}
    public int getLength(){return length;}
    public int getRelease_year(){return release_year;}
    public void setRelease_year(int release_year) {this.release_year = release_year;}
    public void setLanguage_id(int language_id){this.language_id=language_id;}
    public int getLanguage_id(){return language_id;}
    /*


        public String getJsonObjectOfFilm(){
        return "{"+
                "\"Title\" : \" "+ filmTitle + "\"," +
                "\"Running time\" : \" " + runningTime + "\" mins\","+
                "\"Starring\" : \" " +actorName + "\""+
                "}";

    } */
}
