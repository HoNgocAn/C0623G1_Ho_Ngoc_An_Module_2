package ss10_dsa_danhsach.bai_tap;

public class MyListTest {
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
