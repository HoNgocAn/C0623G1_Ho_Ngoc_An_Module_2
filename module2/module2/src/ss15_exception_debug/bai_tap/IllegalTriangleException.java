package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        do {
            try {
                System.out.println("Nhập cạnh a");
                a = input.nextDouble();
                System.out.println("Nhập cạnh b");
                b = input.nextDouble();
                System.out.println("Nhập cạnh c");
                c = input.nextDouble();
                if (a <= 0 || b <= 0 || c <= 0 || (a+b)<=c || (a+c)<=b || (b+c)<=a){
                    System.out.println("Đây không phải là 3 cạnh của một tam giác. Đề nghị nhập lại");
                } else {
                System.out.println("Đây là 3 cạnh của một tam giác");
                }
                } catch (Exception e) {
                System.err.println("Lỗi " + e.getMessage() + " .Đề nghị nhập đúng định dạng");
                    break;
                }
        }while (a <= 0 || b <= 0 || c <= 0 || (a+b)<=c || (a+c)<=b || (b+c)<=a ) ;
    }
}
