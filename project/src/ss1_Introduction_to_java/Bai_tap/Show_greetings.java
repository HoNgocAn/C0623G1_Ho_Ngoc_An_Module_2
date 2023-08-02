package ss1_Introduction_to_java.Bai_tap;

import java.util.Scanner;

public class Show_greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
