package Day4;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String str = sc.nextLine();
        StringBuilder s = new StringBuilder("");

        int j = str.length() - 1;
        while (j >= 0) {
            char ch = str.charAt(j);
            s.append(ch);
            j--;
        }
        System.out.println(s.toString());
        sc.close();

    }

}
