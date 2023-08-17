package ss13_thuattoantimkiem.bai_tap;

import java.util.Scanner;

public class Exersise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element ");
            arr[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array whose elements are ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want to search for ");
        int n;
        System.out.println("The element appears in the array and is at position " + binarySearch(arr, n = input.nextInt()));
    }
    static int binarySearch(int[] arr,int value){
        int left = 0;
        int right = arr.length -1;
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



