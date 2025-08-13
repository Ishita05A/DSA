package Step6.LL_doubly;

public class insertElementAtEnd {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        
    }
    static Node insert_element(Node head, int val){
        Node temp = head;
        Node t1 = new Node(val);
       while(temp.next != null){
            temp = temp.next;
       }
       temp.next = t1;
       t1.prev = temp;
       return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        display(a);
        a = insert_element(a, 8);
        display(a);
    }
    
}
