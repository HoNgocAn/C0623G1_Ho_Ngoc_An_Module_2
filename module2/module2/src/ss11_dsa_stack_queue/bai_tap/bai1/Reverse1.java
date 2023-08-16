package ss11_dsa_stack_queue.bai_tap.bai1;

import java.util.Arrays;
import java.util.Stack;

public class Reverse1 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push("Ho");
        stack.push("Ngoc");
        stack.push("An");

        System.out.println("Mảng cũ " + Arrays.toString(stack.toArray()));

        int size = stack.size();
        Stack newStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            newStack.push(stack.pop());
        }

        System.out.println("Mảng mới " + Arrays.toString(newStack.toArray()));
    }
}
