package Step3.Easy;

import java.util.Scanner;

public class isArraySorted {
    static boolean is_sorted(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]) return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(is_sorted(arr));
        sc.close();
    }
    
}
