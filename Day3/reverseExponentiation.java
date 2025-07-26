package Day3;

import java.util.Scanner;

public class reverseExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        int rem = 0;
        int pow = 1;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        while (rev > 0) {
            pow *= num;
            rev--;
        }
        System.out.println(pow);
        sc.close();
    }

}
