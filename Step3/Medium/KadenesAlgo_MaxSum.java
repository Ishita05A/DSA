package Step3.Medium;

import java.util.Scanner;

public class KadenesAlgo_MaxSum {
    static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
        sc.close();
    }
    
}
