package com.kptsang.movieproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieprojectApplicationTests {

	@Test
	public void testGetFilmTitleMethod() {
		Film testFilm = new Film(2002,"The Shining",144, 1980);
		assertEquals("The title is wrong", "The Shining", testFilm.getTitle());
	}

	@Test
	public void testSetFilmTitleMethod(){
		String title = "The Shining";
		Film testFilm = new Film (2002, "The Shining", 144, 1980);
		testFilm.setTitle("The Shining");
		assertEquals("this title is wrong", testFilm.getTitle(), title );
	}

	@Test
	public void testGetLengthMethod(){
		Film testFilm = new Film(2002,"The Shining",144, 1980);
		assertEquals("The title is wrong", 144, testFilm.getLength());
	}

	@Test
	public void testSetLengthMethod(){
		int length = 10;
		Film testFilm = new Film(2000, "Bomonga", 10, 1984);
		testFilm.setLength(10);
		assertEquals("IT'S ALL WRONG", testFilm.getLength(), length);
	}

	@Test
	public void testGetYearMethod(){
		Film testFilm = new Film (2002,"The Shining",144, 1980);
		assertEquals("The year is wrong", 1980, testFilm.getRelease_year());
	}

	@Test
	public void testSetYearMethod(){
		int year =1980;
		Film testFilm = new Film (2002, "The Shining", 144,1980);
		testFilm.setRelease_year(1980);
		assertEquals("Wrong", testFilm.getRelease_year(), year);
	}

	@Test
	public void testGetFirstName(){
		Actor testActor = new Actor (150, "Willem", "Dafoe", "2020");
		assertEquals("WRONG", "Willem", testActor.getFirst_name());
	}

	@Test
	public void testSetFirstName(){
		String first_name = "Jack";
		Actor testActor = new Actor(150, "Jack", "Black","2020");
		assertEquals("Nope", testActor.getFirst_name(), first_name);
	}

	@Test
	public void testGetLastName(){
		Actor testActor = new Actor (150, "Jack", "Black","2020");
		assertEquals("NO", "Black", testActor.getLast_name());
	}
	@Test
	public void testSetLastName(){
		String last_name = "Black";
		Actor testActor = new Actor (150, "Jack", "Black", "2020");
		assertEquals("Nah", testActor.getLast_name(), last_name);

	}
}