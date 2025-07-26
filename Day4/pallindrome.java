package Day4;

import java.util.Scanner;

public class pallindrome {
    static boolean isPallindrome(int n) {
        int rev = 0;
        int num = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (rev == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(isPallindrome(n));
        sc.close();
    }

}
