package Step6.MediumProblemLL;

public class add2noLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
     static void display(Node temp){
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static Node add2LL(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;
        int sum = 0;
        while(temp1 != null || temp2 != null){
            sum = carry;
            if(temp1 != null){
                sum+=temp1.data;
                temp1 = temp1.next;

            }
            if(temp2 != null){
                sum+=temp2.data;
                temp2 = temp2.next;
            }
            if(sum >= 10){
                int val = sum % 10;
                Node curr = new Node(val);
                carry = sum/10;
                temp.next = curr;
                temp = temp.next;
            }
            else{
                Node curr = new Node(sum);
                temp.next = curr;
                temp = temp.next;
                carry = 0;
            }

        }
        if(carry >0){
            Node curr = new Node(carry);
            temp.next = curr;
            temp = temp.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);
        Node u = new Node(5);
        Node v = new Node(6);
        Node w = new Node(4);
        a.next = b;
        b.next = c;
        u.next = v;
        v.next = w;
        Node head = add2LL(a, u);
        display(head);
        
    }
}
