// Pallindrome
package Day03;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (n == rev)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
        sc.close();
    }

}
