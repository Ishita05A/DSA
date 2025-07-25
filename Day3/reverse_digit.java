package Day3;

import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int rev = 0;
        int r = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        System.out.println(rev);
        sc.close();
    }

}
