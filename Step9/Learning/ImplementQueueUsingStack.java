package Step9.Learning;

import java.util.Stack;

public class ImplementQueueUsingStack {
    public static class Queue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> qt = new Stack<>();
        int size = 0;
        void add(int val){
            st.push(val);
            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            
            for(int i = 1;i<=size-1;i++){
                qt.push(st.pop());
            }
            int val = st.pop();
            size--;
            while(!qt.isEmpty()){
                st.push(qt.pop());
            }
            
            return val;
        }
        int element(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!st.isEmpty()){
                qt.push(st.pop());
            }
            int val = qt.peek();
            while(!qt.isEmpty()){
                st.push(qt.pop());
            }
            return val;
        }
        boolean isEmpty(){
            return size==0;
        }
        void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            while(!st.empty()){
                qt.push(st.pop());
            }
            while(!qt.isEmpty()){
                System.out.print(qt.peek()+" ");
                st.push(qt.pop());
            }
            System.out.println();
           
            
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.remove());
        q.add(5);
        q.add(6);
        q.add(8);
        q.add(9);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.element());
        q.display();
    }
    
}
