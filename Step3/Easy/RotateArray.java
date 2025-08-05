package Step3.Easy;

import java.util.Scanner;

public class RotateArray {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotate(int[] arr , int k){
        int n= arr.length;
        k = k%n;
        int[] a = new int[n];
        int j = 0;
        for(int i = k-1;i<n;i++){
            a[j++] = arr[i];
        }
        for(int i = 0; i<k-1;i++){
            a[j++] = arr[i];
        }
        return a;
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
        int[] a = rotate(arr, 3);
        display(a);
        sc.close();
    }
}
