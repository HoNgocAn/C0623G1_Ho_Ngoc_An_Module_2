package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class FindWish {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        int count=0;
        for (int i=1; i<=a && i<=b;i++){
            if (a%i==0 && b%i==0){
                count = i;
            }
        }
        System.out.print("Greatest common factor: " + count);
    }
}




