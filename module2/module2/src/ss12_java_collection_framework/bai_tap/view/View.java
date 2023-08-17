package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.controller.ProductManage;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage pro = new ProductManage();
        int choice = 0;
        do {
            System.out.println("MENU");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println("1.Thêm sản phẩm .");
            System.out.println("2.Sửa thông tin sản phẩm theo id.");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm theo giá");
            System.out.println("0. Thoát khỏi chương trình");
            choice = sc.nextInt();
            if (choice==1){
                System.out.println("Nhập id sản phẩm"); int id = sc.nextInt();
                System.out.println("Nhập tên sản phẩm"); String name = sc.nextLine();
                System.out.println("Nhập giá sản phẩm"); double price = sc.nextDouble();
                Product product = new Product(id,name,price);
                pro.addProduct(product);
            } else if(choice==2){
                
            } else if (choice==3) {
                System.out.println("Nhâp id sản phẩm"); int id = sc.nextInt();
                Product product = new Product(id);
                pro.deleteProduct(product);
            } else if (choice==4) {
                pro.printProductManage();
            } else if (choice==5) {
                System.out.println("Nhập tên sản phẩm"); String name = sc.nextLine();
                System.out.println("Kết quả tìm kiếm");
                pro.findProduct(name);
            } else if (choice==6) {
                pro.sortByPrice();
                pro.printProductManage();
            } else {
                System.out.println("Đề nghị nhập lại");
            }
        }while(choice !=0);
    }

    public void run() {
    }
}