package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class ImplementLowerBound {
    static int lowerBound(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = -1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(arr[mid] < target) st = mid +1;
            else if(arr[mid] > target) end = mid -1;
            else if(arr[mid] == target) {
                idx = mid;
                end = mid - 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(lowerBound(arr, x));

    }
    
}
