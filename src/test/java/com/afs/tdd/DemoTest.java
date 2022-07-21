package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_given_0_0_N_M() {
        int exceptedX=0;
        int exceptedY=1;
        String exceptedDirection="N";
        String instruction="M";
        MarsRover marsRover =new MarsRover(0,0,"N");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getX());
        assertEquals(exceptedY, marsRover.getY());
        assertEquals(exceptedDirection, marsRover.getDirection());
    }


}
