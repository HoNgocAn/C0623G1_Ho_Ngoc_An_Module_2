package ss11_dsa_stack_queue.bai_tap.bai4;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        String arr = "ABLE was I ere I saw ELBA";
        System.out.println(arr);
        Queue queue = new LinkedList();
        for (int i = arr.length()-1; i >= 0; i--) {
            queue.add(arr.charAt(i));
        }
        String newString = "";
        while (!queue.isEmpty()) {
            newString = newString + queue.remove();
        }
        if(arr.equals(newString)){
            System.out.println("Chuỗi Palindrom");
        }else {
            System.out.println("Không phải chuỗi Palindrom");
        }
    }
}
