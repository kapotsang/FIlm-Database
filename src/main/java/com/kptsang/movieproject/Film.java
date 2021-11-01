package com.kptsang.movieproject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int film_id;

    private String title;
    private int length;
    //private String actorName;

    public Film(String title, int length ){
        this.title = title;
        this.length = length;
        //this.actorName = actorName;

    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){return length;}
   // public void setActorName(String actorName){this.actorName = actorName;}
    //public String getActorName(){return actorName;}
    public int getId() {return film_id;}
    public void setId(int film_id) {this.film_id = film_id;}

    /* public String getJsonObjectOfFilm(){
        return "{"+
                "\"Title\" : \" "+ filmTitle + "\"," +
                "\"Running time\" : \" " + runningTime + "\" mins\","+
                "\"Starring\" : \" " +actorName + "\""+
                "}";
    } */
}
