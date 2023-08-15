package ss11_dsa_stack_queue.bai_tap.bai3;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack<>();
        System.out.println("Nhập số cần chuyển");
        int binary =  scanner.nextInt();
        int quotient;
        do {
            quotient = binary%2;
            stack.push(quotient);
            binary = binary/2;
        } while (binary>=1);

        int size = stack.size();
        String result = "";
        for (int i = 0; i < size; i++) {
            result+= stack.pop();
        }
        System.out.println("Kết quả khi chuyển: " + result);
    }
}

