package Step3.Medium;

import java.util.Scanner;

public class Max_sum_BruteForce {
    static int maxSum(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(max, sum);
            }
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
