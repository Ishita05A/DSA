package Step6.LL_1D;

public class DeleteTail {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void delete_tail(Node head){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next =null;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        delete_tail(a);
        display(a);
    }
}
