package Step6.MediumProblemLL;

public class RemoveNthNodeFromBack {
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
    static Node remove(Node head, int k){
        Node temp = head;
        int length = 0;
        while (temp!=null){
            length++;
            temp = temp.next;

        }
        temp = head;
        int num = 0;
        while(num!=length-k-1){
            temp = temp.next;
            num++;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        a =remove(a, 3);
        display(a);
    }
    
}
