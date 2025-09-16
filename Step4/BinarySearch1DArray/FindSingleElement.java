package Step4.BinarySearch1DArray;

import java.util.Scanner;

public class FindSingleElement {
    static int singleElement(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) return arr[mid];
            if( (mid%2 == 1 && arr[mid] == arr[mid-1]) || (mid%2==0 && arr[mid] == arr[mid+1])) st = mid +1;
            else end = mid - 1;
        }
        return -1;
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
        System.out.println(singleElement(arr));
        sc.close();
    }
    
}
