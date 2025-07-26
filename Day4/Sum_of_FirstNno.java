package Day4;

import java.util.Scanner;

public class Sum_of_FirstNno {
    static int sum(int n) {
        if (n == 1)
            return n;
        return (sum(n - 1) + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println(sum(n));

        sc.close();
    }

}
