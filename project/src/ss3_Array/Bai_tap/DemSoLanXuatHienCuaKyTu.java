package ss3_Array.Bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {

        String str = "abcddd";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ký tự");
        String name = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str[i].equals(name)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Ký tự " + name + "xuất hiện" + count + " lần trong chuỗi");
        } else {
            System.out.println("Ký tự " + name + " không xuất hiện trong chuỗi");
        }

    }
}
