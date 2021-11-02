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

    public Film(String title, int length, int release_year ){
        this.title = title;
        this.length = length;
        this.release_year = release_year;


    }
    public Film(){

    }

    public void setTitle(String title){this.title = title;}
    public String getTitle(){return title;}
    public void setLength(int length){this.length = length;}
    public int getLength(){return length;}
    public int getRelease_year(){return release_year;}
    public void setRelease_year(int release_year) {this.release_year = release_year;}
    /*


        public String getJsonObjectOfFilm(){
        return "{"+
                "\"Title\" : \" "+ filmTitle + "\"," +
                "\"Running time\" : \" " + runningTime + "\" mins\","+
                "\"Starring\" : \" " +actorName + "\""+
                "}";

    } */
}
