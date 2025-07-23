package Day1;

import java.util.Scanner;

public class S2_if_else {
    static void Grade(int n) {
        if (n >= 90)
            System.out.println("Grade A");
        else if (n >= 70)
            System.out.println("Grade B");
        else if (n >= 50)
            System.out.println("Grade C");
        else if (n >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int n = sc.nextInt();
        Grade(n);
        sc.close();
    }

}
