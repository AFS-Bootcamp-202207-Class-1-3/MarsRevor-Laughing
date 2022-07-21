package com.afs.tdd;

public class MarsRover {

    private Location location;

    private static final int[] dx={0,1,0,-1};
    private static final int[] dy={1,0,-1,0};

    private static final String[] dStr={"N","E","N","W"};

    public MarsRover(int x, int y, String direction) {
       this.location=new Location(x,y,direction);
    }

    public MarsRover() {
        this.location=new Location(0,0,"N");
    }

    public Location receiveInstruction(String instruction){
        switch (instruction){
            case "M":{
                this.Move();
            }break;
            case "L":{
                this.turnLeft();
            }
        }

        return this.location;
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
        this.location.x+=dx[getDirectionIndex(this.location.Direction)];
        this.location.y+=dy[getDirectionIndex(this.location.Direction)];
    }

    public void turnLeft(){
        this.location.Direction=dStr[(getDirectionIndex(this.location.Direction)+3)%4];
    }


    public Location getLocation() {
        return location;
    }
}
