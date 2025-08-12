package Step9.Learning;

import java.util.Scanner;

public class ImplementStackUsingArray {
    public static class Stack{
        int[] arr = new int[5];
        int size =0;
        int n = arr.length;
        void push(int val){
            if(size == n){
                System.out.println("Stack is Full!!");
                return;
            }
            arr[size] = val;
            size++;
        }
        int pop(){
            if(size == 0){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            size--;
            return arr[size];
        }
        boolean isEmpty(){
            return size==0;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[size-1];
        }
        void display(){
            for(int i = 0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(4);
        st.push(0);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.size);
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
        sc.close();
    } 
}
