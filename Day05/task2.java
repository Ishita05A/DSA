// SUM OF ELEMENTS OF AN ARRAY
package Day05;

import java.util.Scanner;

public class task2 {
    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of 1st array ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Sum of elements of array = " + sum(arr1));
        sc.close();
    }
}
