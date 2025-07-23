package Day1;

import java.util.Scanner;

public class S1_while {
    static void reverseTable(int n) {
        int num = 10;
        while (num > 0) {
            System.out.print(num * n + " ");
            num--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        reverseTable(n);
        sc.close();

    }

}
