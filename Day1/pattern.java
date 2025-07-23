package Day1;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == n - i + 1 || j == n + i - 1 || i == n)
                    System.out.print(i + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
        sc.close();
    }

}
