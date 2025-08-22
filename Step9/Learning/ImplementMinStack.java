package Step9.Learning;

import java.util.Stack;

public class ImplementMinStack {
    public static class Min_Stack {
        int size = 0;
        Stack<Long> st = new Stack<>();
        long min = Integer.MIN_VALUE;

        void push(int x) {
            long val = (long)x;
            if (size == 0) {
                st.push(val);
                min = val;
            } else if (val < min) {
                st.push(2 * val - min);
                min = val;
            } else if (val >= min)
                st.push(val);

            size++;
        }

        int pop() {
            if (size == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            if (st.peek() >= min) {
                long ans = st.peek();
                st.pop();
                size--;
                return (int)ans;
            }

            long ans = min;
            min = 2 * min - st.peek();
            st.pop();
            size--;
            return (int)ans;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            if(st.peek()>=min){
                long ans = st.peek();
                return (int)ans; 
            }
            long ans = 2*min-st.peek();
            return (int)ans;
        }
        int min(){
            return (int)min;
        }
        boolean isEmpty(){
            return size == 0;
        }
        void display(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return;
            }
            Stack<Long> gt = new Stack<>();

            while(!st.isEmpty()) gt.push(st.pop());
            while(!gt.empty()){
                System.out.print(gt.peek()+" ");
                st.push(gt.pop());
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Min_Stack st = new Min_Stack();
        st.push(5);
        st.push(6);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.min());
        System.out.println(st.pop());   
        System.out.println(st.pop());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.min());
    }

}
