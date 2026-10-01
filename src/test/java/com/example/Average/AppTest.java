package com.example.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	App app=new App();
    @Test
    public void averageOfTwo() {
        assertEquals(5,app.averageOfTwo(5,6));
    }
    @Test
    public void averageOfTHree() {
    	assertEquals(6,app.averageOfTHree(5,6,7));
    }
}
