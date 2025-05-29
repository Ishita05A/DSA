// Count digits in a number
package Day04;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("No. of digits = " + count);
        sc.close();
    }

}
