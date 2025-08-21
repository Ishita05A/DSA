package Step9.Learning;

public class ImplementCircularQueueUsingArray {
    public static class Queue {
        int size = 0;
        int[] arr = new int[5];
        int f = -1;
        int r = -1;

        void push(int val) {
            if (size == arr.length) {
                System.out.println("Queue is Full");
                return;
            }
            if (size == 0){
                f = 0;
                r = 0;
                arr[f] = val;
                
            } else if (r == arr.length - 1) {
                r = 0;
                arr[r] = val;
                
            } else if(r<arr.length-1) {
                arr[++r] = val;
                
            }
            size++;
        }

        int pop() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            if (f == arr.length - 1) {
                int ans = arr[f];
                f = 0;
                size--;
                return ans;
            }

            int ans = arr[f++];
            size--;
            return ans;

        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }
        boolean isEmpty(){
            return size==0;
        }
        void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            else if(r<f){
                for(int i = f; i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0; i<=r;i++){
                    System.out.print(arr[i]+" ");
                }

            }
            else{
                for(int i = f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
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
