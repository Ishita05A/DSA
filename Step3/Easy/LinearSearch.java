package Step3.Easy;

import java.util.Scanner;

public class LinearSearch {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void linear_Search(int[] arr, int target){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                System.out.printf("Element found at index %d ",i);
                return;
            }
        }
        System.out.println("Element not found!!!");
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
        System.out.println("Enter element to be searched");
        int x = sc.nextInt();
        linear_Search(arr, x);
        sc.close();

    }
    
}
