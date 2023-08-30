package casestudy.model.Facility;

import casestudy.model.Facility.Facility;

public class House extends Facility {
    private String roomType1;
    private int numberOfFloor1;
    public House(){

    }

    public House(String roomType1, int numberOfFloor1) {
        this.roomType1 = roomType1;
        this.numberOfFloor1 = numberOfFloor1;
    }

    public House(String serviceCode, String serviceName, double acreage, double price, int numberOfPeople, String type, String roomType1, int numberOfFloor1) {
        super(serviceCode, serviceName, acreage, price, numberOfPeople, type);
        this.roomType1 = roomType1;
        this.numberOfFloor1 = numberOfFloor1;
    }

    public String getRoomType1() {
        return roomType1;
    }

    public void setRoomType1(String roomType1) {
        this.roomType1 = roomType1;
    }

    public int getNumberOfFloor1() {
        return numberOfFloor1;
    }

    public void setNumberOfFloor1(int numberOfFloor1) {
        this.numberOfFloor1 = numberOfFloor1;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomType1='" + roomType1 + '\'' +
                ", numberOfFloor1=" + numberOfFloor1 +
                "} " + super.toString();
    }
}
