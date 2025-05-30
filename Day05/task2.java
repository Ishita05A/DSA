// SUM OF AN ARRAY
package Day05;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sum = new int[n];
        System.out.println("Enter elements of 1st array ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of 2nd array ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Sum of 2 array is: ");
        for (int i = 0; i < n; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
        sc.close();
    }
}
