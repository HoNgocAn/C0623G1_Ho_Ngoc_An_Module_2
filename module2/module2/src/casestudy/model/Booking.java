package casestudy.model;

public class Booking {
    private String codeBooking;
    private String dateBooking;
    private String roomRantalDate;
    private String checkOutDate;
    private String customerCode;
    private String serviceCode;
    public Booking(){

    }
    public Booking(String codeBooking, String dateBooking, String roomRantalDate, String checkOutDate, String customerCode, String serviceCode) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.roomRantalDate = roomRantalDate;
        this.checkOutDate = checkOutDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getRoomRantalDate() {
        return roomRantalDate;
    }

    public void setRoomRantalDate(String roomRantalDate) {
        this.roomRantalDate = roomRantalDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
