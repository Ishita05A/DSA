package Day4;

import java.util.Scanner;

public class rec_N_to_1 {
    static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printNto1(n);
        sc.close();
    }

}
