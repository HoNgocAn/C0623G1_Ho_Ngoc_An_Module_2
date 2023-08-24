package ss17_io_binaryfile_serialization.bai_tap.coppy_file.mvc.view;

import ss12_java_collection_framework.bai_tap.controller.ProductManage;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Scanner;

public class ProductManagerView {
    public void run() {
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
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Nhập id sản phẩm");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập giá sản phẩm");
                double price = sc.nextDouble();
                Product product = new Product(id, name, price);
                pro.addProduct(product);
            } else if (choice == 2) {
                System.out.println("Nhâp id sản phẩm");
                int id = sc.nextInt();
                Product product = new Product();
                pro.updateProduct(product);
            } else if (choice == 3) {
                System.out.println("Nhâp id sản phẩm");
                int id = sc.nextInt();
                Product product = new Product();
                pro.deleteProduct(product);
            } else if (choice == 4) {
                pro.printProductManage();
            } else if (choice == 5) {
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Kết quả tìm kiếm");
                pro.findProduct(name);
            } else if (choice == 6) {
                pro.sortByPrice();
                pro.printProductManage();
            } else {
                System.out.println("Đề nghị nhập lại");
            }
        } while (choice != 0);
    }
}



