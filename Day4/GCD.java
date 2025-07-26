package Day4;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        int count = 0;
        int num = 1;
        while (num <= n1 || num <= n2) {
            if (n1 % num == 0 && n2 % num == 0) {

                count++;
            }
            num++;
        }
        System.out.println(count);
        sc.close();
    }

}
