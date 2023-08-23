package ss14_thuattoansapxep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Exersise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nhập độ dài của mảng
        System.out.print("Enter size ");
        int size = input.nextInt();
        //Khởi tạo mảng với độ dài đã nhập
        int [] list = new int [size];
        //Nhập các phần tử là số nguyên vào mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: " );
            list[i] = input.nextInt();
        }
        //Hiển thị mảng trước khi sắp xếp
        System.out.println("Array before sort is " + Arrays.toString(list));
        //Gọi phương thức insertionSort và quan sát kết quả.
        insertionSort(list);
    }
    public static void insertionSort(int[] list){
        //Chạy vòng 1 lặp bắt đầu từ vị trị i=1
        for (int i = 1; i < list.length; i++) {
            int j = i;
            // Chạy vòng lặp 2 bắt đầu ở vị trí j=i, so sánh phần tử ở vị trí j với các phần tử ở trước nó, nếu phần tử ở vị trị j nhỏ hơn thì
            // đổi chổ 2 phần tử với nhau. Tiếp tục vòng lặp cho đến khi hết không còn thỏa mãn điều kiện.
            while (j>0 && list[j]<list[j-1]){
                int tempt = list[j];
                list[j] = list[j-1];
                list[j-1] = tempt;
                j--;
            }
        }
        //In ra mảng sau khi đã đổi chỗ
        System.out.println("Array after sort is " + Arrays.toString(list));
    }
}
