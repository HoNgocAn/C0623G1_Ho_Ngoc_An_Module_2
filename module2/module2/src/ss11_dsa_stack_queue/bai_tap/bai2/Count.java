package ss11_dsa_stack_queue.bai_tap.bai2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        String st1= "khÔng Đi Cũng KhônG sAo";
        String[] arr= st1.split(" ");
        System.out.println("Chuỗi mới "+ st1.toUpperCase());

        Map<String,Integer> map = new TreeMap<String,Integer>();

        for (String s:arr) {
            if(map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s,value);
            }else {
                map.put(s,1);
            }
        }
        System.out.println("Số lần xuất hiện "+ map.toString().toUpperCase());
    }
}
