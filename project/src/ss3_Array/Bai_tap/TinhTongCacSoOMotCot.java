package ss3_Array.Bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        int size1;
        int size2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập size1 và size2: ");
        size1 = input.nextInt();
        size2 = input.nextInt();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int number;
        int total = 0;
        System.out.println("Cột mà người dùng muốn tính tổng" );
        number = input.nextInt();
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j==(number-1)){
                    total = total + array[i][j];
                }
            }
        }
        System.out.println("Tổng của cột: " + number + " là " + total);
    }
}
