package Step6.MediumProblemLL;

public class ReverseRecursively {
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
    static Node reverse(Node head){
        if(head.next == null) return head;
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead; 

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(8);
        Node f = new Node(3);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        display(reverse(a));  
    }
}
