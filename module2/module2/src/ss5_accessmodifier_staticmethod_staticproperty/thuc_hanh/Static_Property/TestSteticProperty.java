package ss5_Accessmodifier_staticmethod_staticproperty.Thuc_hanh.Static_Property;

public class TestSteticProperty {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }

}
