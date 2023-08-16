package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class Calculate {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the width");
            double width = input.nextDouble();
            System.out.println("Enter the height");
            double height = input.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Your Rectanle" + rectangle.display());
            System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
            System.out.println("Area of Rectangle: " + rectangle.getArea());
        }
    }
