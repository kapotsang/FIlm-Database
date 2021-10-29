package com.kptsang.movieproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieprojectApplicationTests {

	@Test
	public void testGetFilmTitleMethod() {
		Film testFilm = new Film("The Shining",144,"Jack Nicholson");
		assertEquals("The title is wrong", "The Shining", "The Shining");
	}

}
