package ss14_thuattoansapxep.bai_tap;
import java.util.Arrays;

import java.util.Scanner;
public class Exersise2 {
    public static void main(String[] args) {
        int [] list = {5,3,7,8,1,9};
        System.out.println("Array before sort is " + Arrays.toString(list));
        insertionSort(list);
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j>0 && list[j]<list[j-1]){
                int tempt = list[j];
                list[j] = list[j-1];
                list[j-1] = tempt;
                j--;
            }
        }
        System.out.println("Array after sort is " + Arrays.toString(list));
    }
}
