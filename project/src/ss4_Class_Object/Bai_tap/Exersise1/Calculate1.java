package ss4_Class_Object.Bai_tap.Exersise1;

import ss4_Class_Object.Thuc_hanh.Rectangle;

import java.util.Scanner;

public class Calculate1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter b");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Roots is:" + quadraticEquation.getRoot1());}
        else if (quadraticEquation.getDiscriminant()>0) {
            System.out.println("Roots is:" + quadraticEquation.getRoot1() + " and " +  quadraticEquation.getRoot2());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}

