package nhap;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Studen1 {
    public static void main(String[] args) {
        int[] list = {9,-1, 7, 5, -1, 4, 2};
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j>0 && list[j]<list[j-1]){
                if (list[j-1]==-1){
                    continue;
                }else{
                    int tempt = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tempt;
                    j--;
                }
            }
        }
        System.out.println("Array after sort is " + Arrays.toString(list));
    }
}







