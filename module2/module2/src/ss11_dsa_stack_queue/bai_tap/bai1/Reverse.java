package ss11_dsa_stack_queue.bai_tap.bai1;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Mảng cũ " + Arrays.toString(stack.toArray()));


        int size = stack.size();
        Stack<Integer> Stack1 = new Stack<>();
        for (int i = 0; i <size; i++) {
            Stack1.push(stack.pop());
        }

        stack = Stack1;
        System.out.println("Mảng mới " + Arrays.toString(stack.toArray()));
    }
}
