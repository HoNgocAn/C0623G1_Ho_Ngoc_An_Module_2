package ss10_DSA_DanhSach.Bai_tap;

public class MyListTest {
    MyList myList = new MyList(10);
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        System.out.println(myList.size());
        myList.add(0, "Ho");
        myList.add(1, "Ngoc ");
        myList.add(2, "An");

        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
    }
}
