package ss2_loop.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        numbers = input.nextInt();
        int count = 0;
        int total = 1;
        int n = 2;
        while (total<=numbers){
            for (int i = 1; i < n; i++){
               if (n%i==0){
                   count++;
               }
            }
            if (count<2){
                System.out.println(n);
                total++;
            }
            count = 0;
            n++;
        }
    }
}

