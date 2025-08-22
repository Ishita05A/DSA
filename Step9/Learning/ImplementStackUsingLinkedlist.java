package Step9.Learning;

public class ImplementStackUsingLinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head = null;
        
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
               

            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        int pop() {
            if (size == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }
        boolean isEmpty(){
            return size==0;
        }
        void recdisplay(Node temp){
            if(temp == null) return ;
            recdisplay(temp.next);
            System.out.print(temp.data+" ");
        }
        void display(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return;
            }
            recdisplay(head);
            System.out.println();
        }

    }

    public static void main(String[] args) {
Stack st = new Stack();
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}
