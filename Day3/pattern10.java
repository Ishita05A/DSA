package Day3;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            int num = i;
            for (int j = 1; j < n; j++) {

                if (j < n - i)
                    System.out.print("  ");
                else {
                    if (num == n) {
                        num--;
                        System.out.print(num-- + " ");
                    } else
                        System.out.print(num-- + " ");
                }
            }
            System.out.println();
        }
        sc.close();

    }

}
