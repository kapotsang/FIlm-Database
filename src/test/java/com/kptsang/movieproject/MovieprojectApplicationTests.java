package com.kptsang.movieproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieprojectApplicationTests {

	@Test
	public void testGetFilmTitleMethod() {
		Film testFilm = new Film("The Shining",144);
		assertEquals("The title is wrong", "The Shining", "The Shining");
	}

	@Test
	public void testSetFilmTitleMethod(){
		String title = "The Shining";
		Film testFilm = new Film ("The Shining", 144);
		testFilm.setTitle("The Shining");
		assertEquals("this title is wrong", testFilm.getTitle(), title );

	}

}
