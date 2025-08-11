package Step3.Medium;

import java.util.Scanner;

public class SubarraywithmaxSum {
    static void subarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int st = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) st = i;
            sum += arr[i];
            
            if(sum > max){
                max = sum;
                end = i;
            }
            if(sum<0){
                sum = 0;
            } 
        }
        System.out.println(max);
        for(int j = st; j<=end;j++){
            System.out.print(arr[j]+" ");
        }
        

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
        subarray(arr);
        sc.close();
    }

}
