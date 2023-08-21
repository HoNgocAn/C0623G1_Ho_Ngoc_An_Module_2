package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a");
            double a = input.nextDouble();
            System.out.println("Nhập cạnh b");
            double b = input.nextDouble();
            System.out.println("Nhập cạnh c");
            double c = input.nextDouble();
            if  (a<=0 || b<=0 || c<= 0){
                System.out.println("Không đúng");
            } else if ((a+b>c) && (b+c)>a && (c+a)>b) {
                System.out.println("Đúng");
            } else {
                System.out.println("Không đúng");
            }
        }catch (Exception e){
            System.out.println("Đề nghị nhập lại các cạnh của tam giác");
        }
    }
}
