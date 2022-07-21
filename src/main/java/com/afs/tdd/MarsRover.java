package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    private static final String[] dStr = {"N", "E", "S", "W"};

    public MarsRover(int x, int y, String direction) {
        this.location = new Location(x, y, direction);
    }

    public MarsRover() {
        this.location = new Location(0, 0, "N");
    }

    public String batchCommand(List<String> instructions) {
        for(String instruction: instructions){
            receiveInstruction(instruction);
        }
        return getLocationReport();
    }

    public String getLocationReport(){
        return String.format("location( %d, %d ), direction: %s",this.location.x,this.location.y,this.location.Direction);
    }

    public Location receiveInstruction(String instruction) {
        switch (instruction) {
            case "M": {
                this.Move();
            }
            break;
            case "L": {
                this.turnLeft();
            }
            break;
            case "R": {
                this.turnRight();
            }
            break;
        }

        return this.location;
    }

    private int getDirectionIndex(String direction) {
        int result;
        switch (direction) {
            case "N":
                result = 0;
                break;
            case "E":
                result = 1;
                break;
            case "S":
                result = 2;
                break;
            case "W":
                result = 3;
                break;
            default:
                result = -1;
        }
        return result;
    }

    private void Move() {
        this.location.x += dx[getDirectionIndex(this.location.Direction)];
        this.location.y += dy[getDirectionIndex(this.location.Direction)];
    }

    private void turnLeft() {
        this.location.Direction = dStr[(getDirectionIndex(this.location.Direction) + dStr.length - 1) % 4];
    }

    private void turnRight() {
        this.location.Direction = dStr[(getDirectionIndex(this.location.Direction) + 1) % 4];
    }

    public Location getLocation() {
        return location;
    }


}
