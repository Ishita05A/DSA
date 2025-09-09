package Step5.Basic;

import java.util.Scanner;

public class RotatedString {
    static boolean isRotated(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        String str = s1+s1;
        if(str.contains(s2)) return true;
        return false;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();
         System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();
        System.out.println(isRotated(s1, s2));
        sc.close();
    }
    
}
