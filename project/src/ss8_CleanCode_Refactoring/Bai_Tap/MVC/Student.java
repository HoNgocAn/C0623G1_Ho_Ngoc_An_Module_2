package ss8_CleanCode_Refactoring.Bai_Tap.MVC;

import java.util.Scanner;

public class Student { ;

    private int id;
    private String name;
    private String gender;
    private double scores;
    private String specialize;

    public Student() {

    }

    // Ham khoi tao co doi so
    public Student(int id, String name, String gender, double scores, String specialize) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.scores = scores;
        this.specialize = specialize;
    }

    // Ham nhap vao thong tin sinh vien
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextInt();
        System.out.print("Nhap ten: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Nhap gioi tinh ");
        gender = sc.nextLine();
        System.out.print("Nhap diem ");
        
    }

    // Ham hien thi thong tin sinh vien
    public void hienThiThongTin() {
        System.out.println("\tId: " + id);
        System.out.println("\tTen: " + ten);
        System.out.println("\tDiem trung binh: " + diemTB);
    }

    // Ham lay thong tin diem trung binh
    public double getDiemTB() {
        return diemTB;
    }

    // Ham lay thong tin ten sinh vien
    public String getTen() {
        return ten;
    }
}

