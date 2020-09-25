package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private RoomStatus roomStatus;
    private String string;

    public Room(int number,String string,RoomStatus roomStatus){
        this.number = number;
        this.roomStatus  = roomStatus;
        this.string = string;
    }
    
/*
    public Room(int number2, String string2, RoomStatus clean) {
    }*/
    
	public int getNumber(){
        return number;
    }

    public RoomStatus getStatus(){
        return roomStatus;
    }
}