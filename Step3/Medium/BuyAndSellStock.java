package Step3.Medium;

import java.util.Scanner;

public class BuyAndSellStock {
    static int stockProblem(int[] arr){
        int profit = 0;
        int cost = 0;
        int mini = arr[0];
        for(int i = 0;i<arr.length; i++){
            cost=arr[i]-mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
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
        System.out.println(stockProblem(arr));
        sc.close();
    }
    
}
