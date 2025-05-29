// largest of 3 number
package Day04;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println("Largest no. is " + a);
            else
                System.out.println("Largest no. is " + c);
        } else {
            if (b > c)
                System.out.println("Largest no. is " + b);
            else
                System.out.println("Largest no. is " + c);
        }
        sc.close();
    }

}
