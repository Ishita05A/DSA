package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class findFirstAndLastOccurance {
    
    static int lowerBound(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int lb = n;
        while(st<=end){
            int mid = st + (end -st)/2;
            if(arr[mid] == target){
                lb = mid;
                end = mid -1;
            }
            else if(arr[mid] < target){
                st = mid +1;
            }
            else end = mid -1;
        }
        return lb;
    }
    static int upperBound(int[] arr, int target){
        int n = arr.length;
        
        int st = 0;
        int end = n-1;
        int ub = n;
        while(st<=end){
            int mid = st + (end -st)/2;
            if(arr[mid] == target){
                ub = mid;
                st = mid +1;
            }
            else if(arr[mid] < target){
                st = mid +1;
            }
            else end = mid -1;
        }
        return ub;

    }
    static int[] findOcurrance(int[] arr,int target){
        int n = arr.length;
        int lb = lowerBound(arr, target);
        if(lb == n || arr[lb] != target) return new int[]{-1,-1};
        int ub = upperBound(arr, target);
        return new int[]{lb,ub};
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
        int[] ans  = findOcurrance(arr, x);
        System.out.printf("lowerBound %d upperbound %d",ans[0] ,ans[1]);
        sc.close();
    }
}
