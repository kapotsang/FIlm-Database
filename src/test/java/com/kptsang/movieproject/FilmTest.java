package com.kptsang.movieproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FilmTest {
    @Test
    public void testGetFilmTitleMethod() {
        Film2 testFilm = new Film2("The Shining", 1);
        assertEquals("The title is wrong", "The Shining", testFilm.getTitle());
    }

    @Test
    public void testSetFilmTitleMethod(){
        String title = "The Shining";
        Film2 testFilm = new Film2 ("The Shining", 1);
        testFilm.setTitle("The Shining");
        assertEquals("this title is wrong", testFilm.getTitle(), title );
    }


    @Test
    public void testGetLangIDMethod() {
        Film2 testFilm = new Film2("The Shining", 1);
        assertEquals("The lang is wrong", 1, testFilm.getLanguage_id());
    }

    @Test
    public void testSeLangIDMethod(){
        int language_id = 1;
        Film2 testFilm = new Film2 ("The Shining", 1);
        testFilm.setTitle("The Shining");
        assertEquals("this title is wrong", testFilm.getLanguage_id(), language_id );
    }
}
