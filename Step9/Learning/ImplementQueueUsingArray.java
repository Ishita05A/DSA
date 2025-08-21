package Step9.Learning;

public class ImplementQueueUsingArray {
    public static class Queue {
        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;

        void add(int val) {
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

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty !!");
                return -1;
            }
            int ans = arr[f];
            f++;
            size--;
            return ans;

        }

        int element() {
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
