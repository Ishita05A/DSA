package Step6.MediumProblemLL;

public class Add1_method2 {
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
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    static Node  add1(Node head){
        head = reverse(head);
        int carry = 1;
        Node temp = head;
        while(temp != null){
             temp.data = temp.data + carry;
             if(temp.data<10){
                carry = 0;
                break;
             }
             temp.data = 0;
             temp = temp.next;
        }
        head = reverse(head);
        if(carry == 1){
            temp = new Node(1);
            temp.next = head;
            head = temp;
        }
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
