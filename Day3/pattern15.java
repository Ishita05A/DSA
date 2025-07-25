package Day3;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print("  ");
                else
                    System.out.print(ch++ + " ");
            }
            ch--;
            for (int j = 1; j < i; j++) {

                System.out.print(--ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
