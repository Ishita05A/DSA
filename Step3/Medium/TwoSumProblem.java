package Step3.Medium;

import java.util.Scanner;

public class TwoSumProblem {
    static boolean findTargetSum(int[] arr, int target){
        for(int i= 0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int x = sc.nextInt();
        System.out.println(findTargetSum(arr, x));
        sc.close();
    }
    
}
