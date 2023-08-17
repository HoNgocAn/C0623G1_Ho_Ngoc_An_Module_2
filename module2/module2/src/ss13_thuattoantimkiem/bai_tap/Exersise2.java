package ss13_thuattoantimkiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Exersise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        
        System.out.println("Array whose elements are ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want to search for ");
        int n = input.nextInt();
        if (binarySearch(arr, n , 0, arr.length - 1) == -1) {
            System.out.println("The element does not appear in the array");
        } else {
            System.out.println("The element appears in the array and is at position " + binarySearch(arr, n, 0, arr.length - 1));
        }
    }

    static int binarySearch(int[] arr,int value,int left,int right){
        left = 0;
        right = arr.length -1;
        while(right>=left){
            int mid = (left+right)/2;
            if (value<arr[mid]){
                right = mid - 1;
            } else if (value==arr[mid]){
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}



