package com.example.android.popularmovies;

/**
 * Created by ravikiranpathade on 4/10/17.
 */

public class Movie {
    public String getMovieName() {
        return movieName;
    }



    String movieName;
    String id;






   public Movie(String i, String name){
       this.movieName = name;
       this.id = i;
   }



}
