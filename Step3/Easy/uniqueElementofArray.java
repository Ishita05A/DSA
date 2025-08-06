package Step3.Easy;

import java.util.Scanner;

public class uniqueElementofArray {
    static int findunique(int[] arr){
        int x = -1;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j]) arr[i] = arr[j] = Integer.MIN_VALUE;
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>Integer.MIN_VALUE){
                x = arr[i];
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findunique(arr));
        sc.close();
    }
    
}
