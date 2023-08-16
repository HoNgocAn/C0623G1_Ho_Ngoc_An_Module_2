package ss10_dsa_danhsach.thuc_hanh.Bai2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(5,10);
        ll.printList();
    }
}
