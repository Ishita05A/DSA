package Step6.LL_1D;

public class insertNodeAtBeigning {
    public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node insert(Node head , int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        a.next=b;
        b.next = c;
        c.next = d;
        display(a);
        a = insert(a, 8);
        display(a);

    }
    
}
