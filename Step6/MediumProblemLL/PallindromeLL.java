package Step6.MediumProblemLL;

public class PallindromeLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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
    static boolean isPallindrome(Node head){
        Node fast = head;
        Node slow = head;
        Node st = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        while(temp!=null){
            if(temp.data != st.data) return false;
            temp = temp.next;
            st = st.next;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(isPallindrome(a));

    }

}
