package Step3.Easy;

import java.util.Scanner;

public class MoveZerosToEnd {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void moveZero(int[] arr){
        int n = arr.length;
        int k = 0; 
        for(int i = 0;i<n;i++){
            if(arr[i]!=0) arr[k++] = arr[i];
        }
        while(k<n){
            arr[k++] = 0;
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZero(arr);
        display(arr);
        sc.close();
    }
}
