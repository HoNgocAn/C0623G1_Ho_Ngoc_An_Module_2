package ss1_Introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Calculate_weight_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double weight, height, bmi;
        System.out.println("Enter kilogram");
        weight = scanner.nextDouble();
        System.out.println("Enter meter");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("Bmi = " + bmi);

        if (bmi < 18){
            System.out.print("Underweight");
        } else if (bmi < 25){
            System.out.print("Normal");
        } else if (bmi < 30){
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
}
