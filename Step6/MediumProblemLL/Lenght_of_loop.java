package Step6.MediumProblemLL;
public class Lenght_of_loop {
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
    static int lengthOfLoop(Node head){
        Node slow = head;
        Node fast = head;
        int count = 1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                Node temp = slow.next;
                while(slow != temp){
                    temp = temp.next;
                    count++;
                }
                return count;
            }
        }
        return -1;
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
        f.next = c; 
        System.out.println(lengthOfLoop(a));
    }
    
}
