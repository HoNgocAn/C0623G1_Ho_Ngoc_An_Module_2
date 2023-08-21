package ss15_exception_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom(){
        Random rd = new Random();
        int [] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử x");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (Exception e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
