package com.kptsang.movieproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    Film2 testFilm = new Film2("The Shining", 1);
    @Test
    public void testGetFilmTitleMethod() {

        assertEquals("The Shining", testFilm.getTitle(),"The title is wrong");
    }

    @Test
    public void testSetFilmTitleMethod(){
        String title = "The Shining";
        testFilm.setTitle("The Shining");
        assertEquals( testFilm.getTitle(), title,"this title is wrong" );
    }


    @Test
    public void testGetLangIDMethod() {

        assertEquals( 1, testFilm.getLanguage_id(),"The lang is wrong");
    }

    @Test
    public void testSeLangIDMethod(){
        int language_id = 1;

        testFilm.setLanguage_id(1);
        assertEquals(testFilm.getLanguage_id(), language_id, "this lang is wrong" );
    }
}
