package ss14_thuattoansapxep.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size ");
        int size = input.nextInt();
        int [] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element ");
            list[i] = input.nextInt();
        }
        System.out.println("List before sort is: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        for (int i = 0; i < list.length-1; i++) {
            for (int j = list.length-1; j > i ; j--) {
                if (list[j]<list[j-1]){
                    int tempt = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tempt;
                }
            }
        }
        System.out.println("list after sort is: ");
        for (int h = 0; h < list.length; h++) {
            System.out.print(list[h]+ " ");
        }
    }
}
