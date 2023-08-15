package ss3_Array;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String [] student = { "A" , "B" , "C"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        String input_name = input.nextLine();
        int count = 0;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                count++;
            }
        }
        if (count > 0){
            System.out.println("Có học sinh đó trong mảng");
        } else {
            System.out.println("Không có học sinh đó trong mảng");
        }
    }
}
