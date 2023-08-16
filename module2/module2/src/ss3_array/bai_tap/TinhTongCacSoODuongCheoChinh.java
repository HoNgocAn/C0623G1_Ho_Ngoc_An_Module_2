package ss3_array.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinh {
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
        int total = 0;
        for (int i = 0; i < size1; i++) {
                    total = total + array[i][i];
                }
        System.out.println("Tổng các số ở đường chéo chính là: " + total);
    }
}
