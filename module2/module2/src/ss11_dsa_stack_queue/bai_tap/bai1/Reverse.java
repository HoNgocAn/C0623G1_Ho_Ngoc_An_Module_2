package ss11_dsa_stack_queue.bai_tap.bai1;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        wStack.push(1);
        wStack.push(2);
        wStack.push(3);

        System.out.println("Mảng cũ " + Arrays.toString(wStack.toArray()));


        int size = wStack.size();
        Stack<Integer> listPopStack = new Stack<>();
        for (int i = 0; i <size; i++) {
            listPopStack.push(wStack.pop());
        }

        wStack = listPopStack;
        System.out.println("Mảng mới " + Arrays.toString(wStack.toArray()));
    }
}
