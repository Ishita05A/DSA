package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class searchInRotatedarray {
    static int findElement(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] == target) return mid;
            else if(arr[st] <= arr[mid]){
                if(arr[st] <= target && target < arr[mid]) end = mid -1;
                else st = mid +1;
            }
            else{
                if(arr[mid] < target && target <= arr[end]) st = mid + 1;
                else end = mid -1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int x = sc.nextInt();
        int ans  = findElement(arr, x);
        System.out.println(ans);
        sc.close();
    
    }
    
}
