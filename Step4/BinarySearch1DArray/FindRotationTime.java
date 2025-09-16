package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class FindRotationTime {
    static int findRotation(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = 0;
        int min = Integer.MAX_VALUE;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[st] <= arr[mid]){
                if(arr[st] < min){
                    min = arr[st];
                    idx = st;
                } 
                st = mid + 1;
            }
            else{
                if(arr[mid]<min){
                     min = arr[mid];
                    idx = mid;
                }
                else end = mid - 1;
            }
        }
        return idx;
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
        System.out.println(findRotation(arr));
        sc.close();
    }

}
