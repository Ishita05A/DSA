package Day4;

import java.util.Scanner;

public class Count_Digit {
    static int countDigit(int n) {
        if (n > 0 && n < 10)
            return 1;
        return (countDigit(n / 10) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();

    }

}
