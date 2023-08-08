package ss5_Accessmodifier_staticmethod_staticproperty.Bai_tap.Exersise2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public String getName(){
        return name;
    }

    public String getClasses(){
        return classes;
    }

    Student(){

    }
    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
