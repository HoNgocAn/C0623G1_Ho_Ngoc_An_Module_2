package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Double vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD");
        Double usd = scanner.nextDouble();
        vnd = usd*23000;
        System.out.print("The amount after conversion is " + vnd + " VNĐ ");
    }
}
