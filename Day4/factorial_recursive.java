package Day4;

import java.util.Scanner;

public class factorial_recursive {
    static int factorial(int n) {
        if (n == 1)
            return n;
        return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }

}
