package Day4;

import java.util.Scanner;

public class Armstrong_Number {
    static boolean isArmstrong(int n) {
        int num = n;
        int n2 = n;
        int count = 0;
        int ans = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        while (n2 > 0) {
            ans += Math.pow(n2 % 10, count);
            n2 /= 10;
        }
        if (ans == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();

    }

}
