package ss3_Array.Bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        size = input.nextInt();
        int []array = new int[size];
        for (int i = 0; i< array.length;i++){
            System.out.print("Nhập các phần tử trong mảng: ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        int index = 0;
        for (int j =1; j< array.length; j++ ){
            if (array[j]<min){
                index = j;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + array[index]);
    }
}

