package ss3_array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6};
        Scanner input = new Scanner(System.in);
        int index;
        int X;
        System.out.println("Nhập số X");
        X = input.nextInt();
        do {
            System.out.println("Nhập vị trí muốn chèn của số X");
            index =  input.nextInt();
            if  (index>=array.length-1 || index<=-1) {
                System.out.println("Đề nghị nhập lại vị trí muốn chèn của số X");
            }
        } while (index>=array.length-1 || index<=-1);
        int []arr1 = new int[array.length+1];
        for (int i=0 ;i<index;i++){
            arr1[i] = array[i];
        }
        arr1[index] = X;
        for (int j=index+1;j<arr1.length;j++){
            arr1[j] = array[j-1];
        }
        System.out.println("Mảng mới là: ");
        for (int k=0; k< arr1.length;k++){
            System.out.print(arr1[k] + " ");
        }
    }
}
