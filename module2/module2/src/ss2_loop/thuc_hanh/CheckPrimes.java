package ss2_Loop.Thuc_hanh;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter number");
        int numbers = scaner.nextInt();
        if (numbers<2){
            System.out.print("This is not prime");
        }
        else {
            int count = 0;
            for (int i=1; i<Math.pow(numbers,0.5);i++){
                if (numbers%i==0){
                    count++;
                }
            }
            if (count>1){
                System.out.print("This is not prime");
            }else{
                System.out.print("This is prime");
            }
        }
    }
}




