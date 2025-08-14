package Step6.LL_1D;

public class Reverse_LL {
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
    static Node reverse_LL(Node head){
        Node curr = head;
        Node after = null;
        Node prev = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    
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
        a=reverse_LL(a);
        display(a);
    }
    
}
