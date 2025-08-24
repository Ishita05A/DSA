package Step6.MediumProblemLL;

public class Add1toNumberLL {
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

    static Node add1(Node head) {
        int num = 0;
        Node temp = head;
        while (temp != null) {
            num = num * 10 + temp.data;
            temp = temp.next;
        }
        num++;
        Node newHead = null;
        Node tail = null;
        
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            temp = new Node(str.charAt(i)-'0');
            if(newHead==null){
                newHead = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            

        }
        tail.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        Node head = add1(a);
        display(head);

    }

}
