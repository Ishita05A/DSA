package Day4;

import java.util.Scanner;

public class fibbonaci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
        sc.close();

    }

}
