package Day2;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = n; j >= i; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }

}
