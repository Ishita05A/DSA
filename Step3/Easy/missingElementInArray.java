package Step3.Easy;

import java.util.Scanner;
import java.util.*;

public class missingElementInArray {
    static int find_missing(int[] arr){
        Arrays.sort(arr);
        int x = -1;
        if(arr.length == 1 && arr[0]==1) return 2;
        if(arr[0]!=1) return 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]+1 != arr[i+1]){
                x = arr[i]+1;
                break;
            }
            x = arr[i+1]+1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n1 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(find_missing(arr1));
        sc.close();

    }
    
}
