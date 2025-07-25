package Day3;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while (n > 0) {
            if (num % (n % 10) == 0) {
                count++;

            }
            n /= 10;
        }
        System.out.println(count);
        sc.close();
    }

}
