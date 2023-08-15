package ss6_Kethua;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int n;
        int number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter lenght ");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Enter number ");
        number = scanner.nextInt();
        int A[] = new int[n];

        System.out.println("Enter Element ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < number ; i++) {
                sum = sum + A[i];
            }
        for (int j = number; j < A.length; j++){
                sum1 = sum1 + A[j];
        }
        if (sum == sum1) {
            System.out.println("Array is not beautiful");
        } else {
            System.out.println("Array is beautiful");
        }
    }
}
