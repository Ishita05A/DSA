package Step6.MediumProblemLL;

public class SortLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  =data;
        }
    }
    static void display(Node temp){
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    static Node merge(Node list1, Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            temp.next = list1;
            temp = list1;
            list1 = list1.next;
        }
        while(list2 != null){
            temp.next = list2;
            temp = list2;
            list2 = list2.next;
        }
        return dummyNode.next;
    }
    static Node mergesort(Node head){
        if(head == null || head.next == null) return head;
        Node mid = findMiddle(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        left = mergesort(left);
        right = mergesort(right);
        return merge(left, right);


        
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d = new Node(1);
        Node e = new Node(0);
        Node f = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node head = mergesort(a);
        display(head);
      }
    
}
