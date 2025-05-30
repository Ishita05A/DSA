package Day05;

import java.util.Scanner;

public class task4 {
    static int singlevalue(int[] arr) {
        int min = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = min;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min)
                ans = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of  array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Single number = " + singlevalue(arr));
        sc.close();
    }

}
