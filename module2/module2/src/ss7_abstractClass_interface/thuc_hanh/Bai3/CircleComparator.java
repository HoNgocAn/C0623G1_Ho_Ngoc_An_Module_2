package ss7_abstractClass_interface.thuc_hanh.Bai3;

import ss5_accessmodifier_staticmethod_staticproperty.bai_tap.Exersise1.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
