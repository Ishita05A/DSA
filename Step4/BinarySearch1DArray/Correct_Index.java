package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class Correct_Index {
    static int[] findIndex(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ceil = -1;
        int floor = -1;
        int[] nums = new int[2];
        while(st<=end){
            int mid = st+ (end - st)/2;
            if(arr[mid] > target){
                ceil = mid;
                end = mid - 1;
            } 
            else if(arr[mid] < target){
                floor = mid;
                st = mid + 1;
            }    
            else if(arr[mid] == target){
                floor = mid;
                ceil = mid;
                break;
            }
        }

        nums[0] = arr[floor];
        nums[1] = arr[ceil];
        return nums;
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
        System.out.println("Enter target");
        int x = sc.nextInt();
        int[] ans = findIndex(arr, x);
        System.out.printf("%d %d",ans[0], ans[1]);
        sc.close();


    }
    
}
