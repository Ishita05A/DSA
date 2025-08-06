package Step3.Easy;

import java.util.Scanner;

public class MaximumConsecutive {
    static int findMax_consecutive(int[] arr){
        int max = 0;
        int count = 0;
        int i = 0;
        while(i<arr.length){
            count = 1;
            while(i+1 < arr.length && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            if(count>max){
                max = count;
            }
            i++;
        }
        return max;


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
        System.out.println(findMax_consecutive(arr1));
        sc.close();
    }  
}
