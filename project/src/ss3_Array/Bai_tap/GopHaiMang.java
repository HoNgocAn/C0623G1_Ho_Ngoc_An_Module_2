package ss3_Array.Bai_tap;

import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr1 = new int[3];
        int []arr2 = new int[3];
        System.out.println("Nhập các phần từ của mảng 1");
        for (int i=0; i<3; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Nhập các phần từ của mảng 2");
        for (int j=0; j<3; j++) {
            arr2[j] = input.nextInt();
        }
        int []array = new int[arr1.length + arr2.length];
        for (int h=0; h<arr1.length; h++){
            array[h] = arr1[h];
        }
        for (int k=arr1.length;k<array.length;k++){
            array[k] = arr2[k- arr2.length];
        }
        System.out.println("Mảng mới gồm các phần tử : ");
        for (int valueArray: array) {
            System.out.print(valueArray + " ");
        }
    }
}
