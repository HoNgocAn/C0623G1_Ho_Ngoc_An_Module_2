package casestudy.model.Person;

public class Customer extends Person{
    private String typeOfQuest;
    private String adress;
    public Customer(){

    }


    public Customer(String code, String name, String dateOfBirth, String gender, int id, int numbersPhone, String email, String typeOfQuest, String adress) {
        super(code, name, dateOfBirth, gender, id, numbersPhone, email);
        this.typeOfQuest = typeOfQuest;
        this.adress = adress;
    }

    public String getTypeOfQuest() {
        return typeOfQuest;
    }

    public void setTypeOfQuest(String typeOfQuest) {
        this.typeOfQuest = typeOfQuest;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer {" + super.toString()+
                "typeOfQuest='" + typeOfQuest + '\'' +
                ", adress='" + adress + '\'' +
                "} ";
    }
}
