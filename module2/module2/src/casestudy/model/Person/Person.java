package casestudy.model.Person;

public abstract class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private int id;
    private int numbersPhone;
    private String email;
    public Person(){

    }
    public Person(String code, String name, String dateOfBirth, int id, int numbersPhone, String email) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.numbersPhone = numbersPhone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumbersPhone() {
        return numbersPhone;
    }

    public void setNumbersPhone(int numbersPhone) {
        this.numbersPhone = numbersPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id=" + id +
                ", numbersPhone=" + numbersPhone +
                ", email='" + email + '\''
                ;
    }
}
