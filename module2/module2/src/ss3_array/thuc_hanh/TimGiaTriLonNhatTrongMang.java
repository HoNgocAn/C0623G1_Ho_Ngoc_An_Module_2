package ss3_array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size>20){
                System.out.println("Đề nghị nhập lại đô dài < 20");
                size = input.nextInt();
            }
        } while (size>20);
        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.print("Nhập phần từ trong mảng: ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Các phần tử đã nhập: ");
        for ( int j=0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        int max =  array[0];
        int index = 0;
        for ( int h = 0; h < array.length; h++){
            if (array[h] > max){
                max = array[h];
                index = h;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        System.out.println("Vị trí của phẩn tử đó là: " + index);
    }
}
