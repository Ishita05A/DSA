package Step3.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Duplicate {
    static ArrayList<Integer> remove_duplicate(int[] arr){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) arr[j] = Integer.MIN_VALUE;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>Integer.MIN_VALUE) a.add(arr[i]);
        }
        return a;
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
        System.out.println(remove_duplicate(arr));
        sc.close();
    }
    
}
