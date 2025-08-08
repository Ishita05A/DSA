package Step3.Medium;

import java.util.Scanner;

public class MajorityElementNby2Times {
    static int majority(int[] arr){
        int num = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count>n/2){
                num = arr[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majority(arr));
        sc.close();

    }
    
}
