package ss14_thuattoansapxep.bai_tap;

import java.util.Scanner;

public class Exersise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size ");
        int size = input.nextInt();
        int [] list = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            list[i] = input.nextInt();
        }
        System.out.print("List is ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
        System.out.println();
        insertionSort(list);
    }
    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int j = i;
            while (j>0 && list[j]<list[j-1]){
                int tempt = list[j];
                list[j] = list[j-1];
                list[j-1] = tempt;
                j--;
            }
        }
        System.out.print("List after sort is ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");s
        }
    }
}
