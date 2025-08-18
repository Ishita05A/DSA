package Step6.MediumProblemLL;

public class SegregateEvenOdd {
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
    static Node evenOddLL(Node head){
        Node tempo = new Node(-1);
        Node odd = tempo;
        Node tempe = new Node(-1);
        Node even = tempe;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 !=0){
                tempo.next = temp;
                tempo = tempo.next;
            }
            else{
                tempe.next = temp;
                tempe = tempe.next;
            }
            temp = temp.next;
        } 
        even = even.next;
        odd = odd.next;
        tempe.next = odd;
        tempo.next = null;
        if(even == null) return odd;
        return even;

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
        Node head = evenOddLL(a);
        display(head);
    }
    
}
