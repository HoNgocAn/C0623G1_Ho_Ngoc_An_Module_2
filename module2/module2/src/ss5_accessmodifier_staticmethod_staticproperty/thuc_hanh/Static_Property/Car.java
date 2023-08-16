package ss5_Accessmodifier_staticmethod_staticproperty.Thuc_hanh.Static_Property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
