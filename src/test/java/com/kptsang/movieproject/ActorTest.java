package com.kptsang.movieproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest{
    Actor testActor = new Actor(1234, "Bingus", "Jones", "2021");

    @Test
    public void testGetID(){
        assertEquals(1234, testActor.getActor_id(), "Wrong ID");
    }

    @Test
    public void testSetID(){
        int actor_id = 1234;
        testActor.setActor_id(actor_id);
        assertEquals(testActor.getActor_id(), actor_id, "wrong id");
    }
    @Test
    public void testGetFirst(){
        assertEquals("Bingus", testActor.getFirst_name(), "wrong first name");
    }

    @Test
    public void testSetFirst(){
        String first_name = "Bingus";
        testActor.setFirst_name(first_name);
        assertEquals(testActor.getFirst_name(), first_name, "wrong first name");
    }

    @Test
    public void testGetLast(){
        assertEquals("Jones", testActor.getLast_name(), "wrong last name");
    }

    @Test
    public void testSetLast(){
        String last_name = "Jones";
        testActor.setLast_name(last_name);
        assertEquals(testActor.getLast_name(), last_name, "wrong last name");
    }

    @Test
    public void testGetUpdate(){
        assertEquals("2021", testActor.getLast_update(), "wrong date");
    }
    @Test
    public void testSetUpdate(){
        String Last_update = "2021";
        testActor.setLast_update(Last_update);
        assertEquals(testActor.getLast_update(), Last_update, "wrong date");
    }



}