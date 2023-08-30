package casestudy.model.Person;

public class Customer extends Person{
    private String typeOfQuest;
    private String adresss;
    public Customer(){

    }

    public Customer(String typeOfQuest, String adresss) {
        this.typeOfQuest = typeOfQuest;
        this.adresss = adresss;
    }

    public Customer(String code, String name, String dateOfBirth, int id, int numbersPhone, String email, String typeOfQuest, String adresss) {
        super(code, name, dateOfBirth, id, numbersPhone, email);
        this.typeOfQuest = typeOfQuest;
        this.adresss = adresss;
    }

    public String getTypeOfQuest() {
        return typeOfQuest;
    }

    public void setTypeOfQuest(String typeOfQuest) {
        this.typeOfQuest = typeOfQuest;
    }

    public String getAdresss() {
        return adresss;
    }

    public void setAdresss(String adresss) {
        this.adresss = adresss;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfQuest='" + typeOfQuest + '\'' +
                ", adresss='" + adresss + '\'' +
                "} " + super.toString();
    }
}
