package casestudy.model.Facility;

import java.util.Date;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double acreage;
    private double price;
    private int numberOfPeople;
    private String type;
    public Facility(){

    }
    public Facility(String serviceCode, String serviceName, double acreage, double price, int numberOfPeople, String type) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.type = type;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", price=" + price +
                ", numberOfPeople=" + numberOfPeople +
                ", type='" + type + '\'' +
                '}';
    }
}
