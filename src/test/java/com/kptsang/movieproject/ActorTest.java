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

}