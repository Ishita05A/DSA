package Step6.MediumProblemLL;

public class MiddleOfEven {
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
    static int middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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
        System.out.println(middle(a));
    }
    
}
