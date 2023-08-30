package casestudy.model;

public class Contract {
    private int numberContracts;
    private String codeBooking;
    private double deposit;
    private double totalPayment;
    public Contract(){

    }

    public Contract(int numberContracts, String codeBooking, double deposit, double totalPayment) {
        this.numberContracts = numberContracts;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public int getNumberContracts() {
        return numberContracts;
    }

    public void setNumberContracts(int numberContracts) {
        this.numberContracts = numberContracts;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
