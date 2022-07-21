package com.afs.tdd;

public class MarsRover {
    private int x=0;
    private int y=0;
    private String Direction="N";

    private static final int[] dx={0,1,0,-1};
    private static final int[] dy={1,0,-1,0};

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        Direction = direction;
    }

    public MarsRover() {}

    public String receiveInstruction(String instruction){
        switch (instruction){
            case "M":{
                this.Move();
            }break;
            default:{
                return "Unknown Instruction";
            }
        }

        return getLocation();
    }

    public String getLocation(){
        return String.format("location( %d, %d ), direction %s",this.x,this.y,this.Direction);
    }
    public int getDirectionIndex(String direction){
        int result;
        switch (direction){
            case "N":result=0;break;
            case "E":result=1;break;
            case "S":result=2;break;
            case "W":result=3;break;
            default:result=-1;
        }
        return result;
    }
    public void Move(){
        this.x+=dx[getDirectionIndex(this.Direction)];
        this.y+=dy[getDirectionIndex(this.Direction)];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return Direction;
    }
}
