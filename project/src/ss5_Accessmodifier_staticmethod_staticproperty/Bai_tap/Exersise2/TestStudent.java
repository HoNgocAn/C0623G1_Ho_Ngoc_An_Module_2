package ss5_Accessmodifier_staticmethod_staticproperty.Bai_tap.Exersise2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("An");
        student.setClasses("C0623G1");
        System.out.println("New name is: " + student.getName() + " and new Class is: " + student.getClasses());
    }
}
