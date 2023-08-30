package casestudy.model.Facility;

import casestudy.model.Facility.Facility;

public class Villa extends Facility {
    private String roomType;
    private double swimmingPoolArea;
    private int numberOfFloor;

    public Villa(){

    }
    public Villa(String roomType, double swimmingPoolArea, int numberOfFloor) {
        this.roomType = roomType;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceCode, String serviceName, double acreage, double price, int numberOfPeople, String type, String roomType, double swimmingPoolArea, int numberOfFloor) {
        super(serviceCode, serviceName, acreage, price, numberOfPeople, type);
        this.roomType = roomType;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomType='" + roomType + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }
}
