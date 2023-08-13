package ss8_CleanCode_Refactoring.Bai_Tap.MVC.Person;

import java.util.Date;

public class Student extends Person { ;
    private String className;
    private float score;

    public Student() {
        super();
    }

    public Student(int id, String name, Date dayOfBirth, String gender, String className, float score) {
        super(id, name, dayOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getPoint() {
        return score;
    }

    public void setPoint(int point) {
        this.score = point;
    }

    @Override
    public String toString() {
        return "Student have " + super.toString() + "className= " + className + ", point=" + score;

    }

}

