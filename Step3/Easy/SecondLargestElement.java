package Step3.Easy;

import java.util.Scanner;

public class SecondLargestElement {
    static int secMaximum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i = 0; i<n;i++){
            if(arr[i]>sec_max && arr[i]!=max) sec_max = arr[i];
        }
        if(sec_max == Integer.MIN_VALUE) return -1;
        return sec_max;
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
        System.out.println(secMaximum(arr));
        sc.close();
    }
    
}
