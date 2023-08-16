package ss7_AbstractClass_interface.Thuc_hanh.Bai3;

import ss5_Accessmodifier_staticmethod_staticproperty.Bai_tap.Exersise1.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
        public static void main(String[] args) {
            Circle[] circles = new Circle[3];
            circles[0] = new Circle(3.6);
            circles[1] = new Circle(3.5, "indigo", false);
            circles[2] = new Circle(3.5, "indigo", false);

            System.out.println("Pre-sorted:");
            for (Circle circle : circles) {
                System.out.println(circle);
            }

            Comparator circleComparator = new CircleComparator();
            Arrays.sort(circles, circleComparator);

            System.out.println("After-sorted:");
            for (Circle circle : circles) {
                System.out.println(circle);
            }
        }
    }
