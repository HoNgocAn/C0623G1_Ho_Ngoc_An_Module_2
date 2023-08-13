package ss8_CleanCode_Refactoring.Bai_Tap.MVC.Person;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Date dayOfBirth  ;
    private String gender;

    public Person(){

    }
    public Person (int id, String name, Date dayOfBirth, String gender){
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(){
        return " Person have id =" + id +", name='" + name + ", dayOfBirth=" + dayOfBirth + ", gender='" + gender;
    }
}