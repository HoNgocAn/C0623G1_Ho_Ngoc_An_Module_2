package ss3_array.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size doest not exceed 20");
            }
        } while (size >20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element: ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("Element in array: ");
        for ( int j = 0 ; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        int first = 0;
        int last = array.length-1;
             while(first<last){
                    int tempt = array[first];
                    array[first] = array[last];
                    array[last] = tempt;
                    first++;
                    last--;
             }
        System.out.println("Reverse array");
        for (int h = 0; h < array.length; h++ ){
            System.out.print(array[h] + " ");
        }
    }
}
