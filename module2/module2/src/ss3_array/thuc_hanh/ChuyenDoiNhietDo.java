package ss3_Array;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Chuyển độ F sang độ C");
            System.out.println("2. Chuyển độ C sang độ F");
            System.out.println("0 . Exit");
            System.out.println(" Nhập gia trị choice");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập độ F");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F chuyển sang độ C là: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9)*(fahrenheit - 32);
        return celsius;
    }

}

