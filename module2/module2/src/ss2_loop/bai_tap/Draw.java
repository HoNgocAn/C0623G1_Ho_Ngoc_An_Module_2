package ss2_loop.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the Right triangle ");
            System.out.println("3. Draw the Inverted right triangle");
            System.out.println("4. Draw the Isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 4:
                    System.out.println("Draw the Isosceles triangle");
                    int length2;
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Enter length");
                    length2 = input4.nextInt();
                    for (int i = 0; i <= length2; i++){
                        for (int k=length2; k>i; k--){
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2-1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the Inverted right triangle");
                    int length1;
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Enter length");
                    length1 = input3.nextInt();
                    for (int i = length1; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    System.out.println("Draw the Right triangle");
                    int length;
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter length");
                    length = input2.nextInt();
                    for (int i = 0; i <= length; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 1:
                    System.out.println("Draw the rectangle");
                    int width;
                    int height;
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter width");
                    width = input1.nextInt();
                    System.out.println("Enter height");
                    height = input1.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                     System.exit(0);
                default:
                     System.out.println("No choice!");
                }
            }
        }
    }



