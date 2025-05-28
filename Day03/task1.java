// Factorial of a number
package Day03;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println("Factorial = " + fact);
        sc.close();

    }

}
