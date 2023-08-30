package casestudy.model.Facility;

import casestudy.model.Facility.Facility;

public class Room extends Facility {
    private String freeService;
    public Room(){

    }
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double acreage, double price, int numberOfPeople, String type, String freeService) {
        super(serviceCode, serviceName, acreage, price, numberOfPeople, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
