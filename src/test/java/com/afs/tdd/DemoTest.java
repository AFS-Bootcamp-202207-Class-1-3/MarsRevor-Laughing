package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_given_0_0_N_M() {
        int exceptedX = 0;
        int exceptedY = 1;
        String exceptedDirection = "N";
        String instruction = "M";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_W_when_given_0_0_N_L() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "W";
        String instruction = "L";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }


    @Test
    void should_return_0_0_E_when_given_0_0_N_R() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "E";
        String instruction = "R";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_Negative1_S_when_given_0_0_S_M() {
        int exceptedX = 0;
        int exceptedY = -1;
        String exceptedDirection = "S";
        String instruction = "M";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_E_when_given_0_0_S_L() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "E";
        String instruction = "L";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_W_when_given_0_0_S_R() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "W";
        String instruction = "R";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_1_0_E_when_given_0_0_E_M() {
        int exceptedX = 1;
        int exceptedY = 0;
        String exceptedDirection = "E";
        String instruction = "M";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_N_when_given_0_0_E_L() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "N";
        String instruction = "L";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_S_when_given_0_0_E_R() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "S";
        String instruction = "R";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }


    @Test
    void should_return_negative1_0_W_when_given_0_0_W_M() {
        int exceptedX = -1;
        int exceptedY = 0;
        String exceptedDirection = "W";
        String instruction = "M";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_S_when_given_0_0_W_L() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "S";
        String instruction = "L";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_0_0_N_when_given_0_0_W_R() {
        int exceptedX = 0;
        int exceptedY = 0;
        String exceptedDirection = "N";
        String instruction = "R";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.receiveInstruction(instruction);
        assertEquals(exceptedX, marsRover.getLocation().x);
        assertEquals(exceptedY, marsRover.getLocation().y);
        assertEquals(exceptedDirection, marsRover.getLocation().Direction);
    }

    @Test
    void should_return_location_when_batchCommand_given_instruction(){
        String excepted="location( 0, 2 ), direction: E";
        List<String> instructions=new ArrayList<>();
        instructions.add("M");
        instructions.add("L");
        instructions.add("M");
        instructions.add("R");
        instructions.add("M");
        instructions.add("R");
        instructions.add("M");
        MarsRover marsRover = new MarsRover();
        assertEquals(excepted, marsRover.batchCommand(instructions));
    }
}
