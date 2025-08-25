package Step6.MediumProblemLL;

public class sort012s {
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

    static Node sort_012s(Node head) {
        if(head == null || head.next == null) return head;
        Node temp = head;
        Node zeroHead = new  Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twohead = new Node(-1);
        Node two = twohead;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;

            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else if(temp.data == 2){
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;

        }
        
        if(oneHead.next != null){
            zero.next = oneHead.next;
            one.next = twohead.next;
        } 
        else zero.next = twohead.next;
        one.next = twohead.next;
        two.next = null;
        
        return zeroHead.next;

    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(0);
        Node e = new Node(2);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node head = sort_012s(a);
        display(head);
        
    }

}
