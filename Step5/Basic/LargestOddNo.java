package Step5.Basic;

import java.util.Scanner;

public class LargestOddNo {
    static String largest_odd(String str){
        StringBuilder s = new StringBuilder(str);
        for(int i = str.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1) return s.substring(0,i+1);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        String str = sc.nextLine();
        String s = largest_odd(str);
        System.out.println(s);
        sc.close();
    }
    
}
