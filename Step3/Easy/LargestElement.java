package Step3.Easy;

import java.util.Scanner;

public class LargestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
        sc.close();
    }
    
    
}
