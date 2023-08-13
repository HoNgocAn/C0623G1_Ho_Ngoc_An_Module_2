package ss8_CleanCode_Refactoring.Bai_Tap.MVC.Person;

import java.util.Date;

public class Teacher extends Person{
    private String speciality;

    public Teacher(){
    }
    public Teacher(int id, String name, Date dayOfBirth, String gender, String speciality){
        super(id,name, dayOfBirth, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Lecturer have " + super.toString() +
                "speciality='" + speciality;
    }
}
