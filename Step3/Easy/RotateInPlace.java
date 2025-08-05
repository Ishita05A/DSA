package Step3.Easy;

import java.util.Scanner;

public class RotateInPlace {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void rotate(int[] arr,int st, int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    static void rotate_arr(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        rotate(arr, 0, k-2);
        rotate(arr, k-1, n-1);
        rotate(arr, 0, n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotate_arr(arr, 3);
        display(arr);
        sc.close();
    }
    
}
