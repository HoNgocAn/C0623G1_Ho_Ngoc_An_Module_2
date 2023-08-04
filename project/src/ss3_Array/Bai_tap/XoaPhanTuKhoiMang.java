package ss3_Array.Bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,5,7};
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập X");
        x = input.nextInt();

        int index = 0;
        for (int i=0; i< array.length;i++){
            if (array[i] == x){
                index = i;
            }
        }
        if (index > 0){
            System.out.println("X có xuất hiện trong mảng và ở vị trị số: " + index );
        } else {
            System.out.println("X không xuất hiện trong mảng");
        }

        int [] array1 = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (x==array[i]) {
                continue;
            }
            array1[count] = array[i];
            count++;
        }
        System.out.println("Các phần tử trong mảng mới là: ");
        for (int j=0; j<array1.length; j++) {
            System.out.print(array1[j]);
        }
    }
}
