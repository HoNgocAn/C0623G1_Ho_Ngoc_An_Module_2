package ss3_Array.Bai_tap;

import java.util.Scanner;

public class TimfPhanTuLonNhatTrongMang2Chieu {
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
        int min = array[0][0];
        for (int i = 0; i<size1; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j]<min){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
