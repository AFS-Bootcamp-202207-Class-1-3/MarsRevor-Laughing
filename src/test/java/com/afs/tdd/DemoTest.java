package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_location01N_when_given_M() {
        String excepted="location( x, y ), direction N";
        String instruction="M";
        Application app=new Application();
        assertEquals(excepted,app.receiveInstruction(instruction));
    }
}
