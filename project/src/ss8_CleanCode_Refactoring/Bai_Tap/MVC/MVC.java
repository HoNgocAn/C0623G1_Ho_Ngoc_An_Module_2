package ss8_CleanCode_Refactoring.Bai_Tap.MVC;

import java.util.Scanner;

public class MVC {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add a new teacher or student");
            System.out.println("2. Delete teacher or student ");
            System.out.println("3. See list teacher or student");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
