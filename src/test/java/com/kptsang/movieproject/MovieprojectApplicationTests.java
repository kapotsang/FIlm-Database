package com.kptsang.movieproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieprojectApplicationTests {

	@Test
	public void testGetFilmTitleMethod() {
		Film testFilm = new Film("The Shining",144, 1980);
		assertEquals("The title is wrong", "The Shining", "The Shining");
	}

	@Test
	public void testSetFilmTitleMethod(){
		String title = "The Shining";
		Film testFilm = new Film ("The Shining", 144, 1980);
		testFilm.setTitle("The Shining");
		assertEquals("this title is wrong", testFilm.getTitle(), title );

	}

	@Test
	public void testGetLengthMethod(){
		Film testFilm = new Film("The Shining",144, 1980);
		assertEquals("The title is wrong", 144, 144);
	}

	@Test
	public void testSetLengthMethod(){
		int length = 10;
		Film testFilm = new Film( "Bomonga", 10, 1984);
		testFilm.setLength(10);
		assertEquals("IT'S ALL WRONG", testFilm.getLength(), length);
	}

	@Test
	public void testGetYearMethod(){
		Film testFilm = new Film ("The Shining",144, 1980);
		assertEquals("The year is wrong", 1980, 1980);
	}

	@Test
	public void testSetYearMethod(){
		int year =1980;
		Film testFilm = new Film ("The Shining", 144,1980);
		testFilm.setRelease_year(1980);
		assertEquals("Wrong", testFilm.getRelease_year(), year);
}
}