package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Checkleapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%%d is Not a leap year", year);
                }
            } else {
                System.out.printf("%%d is a leap year", year);
            }
            } else {
                System.out.printf("%d is not a leap year", year);
            }
        }
    }
