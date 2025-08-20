package Step9.Learning;

public class ImplementQueueUsingArray {
    public static class Queue {
        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;

        void push(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full!!");
                return;
            }
            if (f == -1) {
                f = 0;
                r = 0;
                size++;
                arr[f] = val;
                return;
            }
            r++;
            arr[r] = val;
            size++;
        }

        int pop() {
            if (size == 0) {
                System.out.println("Queue is Empty !!");
                return -1;
            }
            int ans = arr[f];
            f++;
            size--;
            return ans;

        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        void display() {
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.pop());
        q.push(4);
        q.push(6);
        q.push(8);
        q.push(9);
        q.push(1);
        q.push(1);
        q.display();
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size);

    }

}
