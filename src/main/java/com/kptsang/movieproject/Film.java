package com.kptsang.movieproject;

public class Film {

    private String filmTitle;
    private int runningTime;
    private String actorName;

    public Film(String filmTitle, int runningTime, String actorName){
        this.filmTitle = filmTitle;
        this.runningTime = runningTime;
        this.actorName = actorName;

    }

    public void setFilmTitle(String filmTitle){
        this.filmTitle = filmTitle;
    }
    public String getFilmTitle(){
        return filmTitle;
    }
    public void setRunningTime(int RunningTime){
        this.runningTime = runningTime;
    }
    public int getRunningTime(){
        return runningTime;
    }
    public void setActorName(String actorName){
        this.actorName = actorName;
    }
    public String getActorName(){
        return actorName;
    }

    public String getJsonObjectOfFilm(){
        return "{"+
                "\"Title\" : \" "+ filmTitle + "\"," +
                "\"Running time\" : \" " + runningTime + "\","+
                "\"Starring\" : \" " +actorName + "\""+
                "}";
    }
}
