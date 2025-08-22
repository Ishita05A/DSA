package Step9.Learning;

public class ImplementQueueUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        int element() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.remove());
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(9);
        q.add(1);
        q.add(1);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.element());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }

}
