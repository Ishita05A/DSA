package Day3;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < n - i + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (j < i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }

}
