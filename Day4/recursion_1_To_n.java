package Day4;

import java.util.Scanner;

public class recursion_1_To_n {
    static void print1toN(int n) {
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        print1toN(n);
        sc.close();

    }

}
