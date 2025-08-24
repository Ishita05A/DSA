package Step6.MediumProblemLL;

public class Add1_method3 {
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

    static int helper(Node temp) {
        if (temp == null)
            return 1;
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if (temp.data < 10) {
            carry = 0;
        }
        else{
            temp.data = 0;
        }
        return carry;
    }

    static Node add1(Node head) {
        Node temp = head;
        int carry = helper(temp);
        if (carry == 0)
            return head;
        temp = new Node(1);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(9);
        Node c = new Node(9);
        a.next = b;
        b.next = c;
        Node head = add1(a);
        display(head);
    }

}
