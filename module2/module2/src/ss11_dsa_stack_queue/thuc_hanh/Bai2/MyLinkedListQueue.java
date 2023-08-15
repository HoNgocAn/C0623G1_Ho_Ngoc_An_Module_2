package ss11_dsa_stack_queue.thuc_hanh.Bai2;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue (int key){
        Node temp = new Node (key);
        if (this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
