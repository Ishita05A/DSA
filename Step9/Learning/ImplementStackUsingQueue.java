package Step9.Learning;

import java.util.LinkedList;
import java.util.Queue;


public class ImplementStackUsingQueue {
    public static class Stack{
        Queue<Integer> q = new LinkedList<>();
        int size = 0;
        void push(int val){
            q.add(val);
            size++;
        }
        int pop(){
            if(size == 0){
                System.out.println("Stack is Empty !!");
                return -1;
            }
            for(int i = 1;i<= size-1;i++){
                q.add(q.remove());
            }
            size--;
            int val = q.remove();
            return val;
        }
        boolean isEmpty(){
            return size == 0;
        }
        int peek(){
            for(int i = 1; i<=size-1;i++){
                q.add(q.remove());
            }
            int val = q.remove();
            q.add(val);
            return val;
        }
        void display(){
            if(size == 0) System.out.println("Stack is Empty");
            for(int i = 1;i<=size;i++){
                int val = q.remove();
                System.out.print(val+" ");
                q.add(val);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(55);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());


    }
    
}
