package Step5.Basic;

import java.util.Scanner;

public class pallindromeWord {
    static String pallindrome(String str){
        StringBuilder s = new StringBuilder(str);
        StringBuilder ans = new StringBuilder("");
        int n  = str.length();
        s.reverse();
        for(int i =0; i<str.length();i++){
            StringBuilder word = new StringBuilder("");
            while(i<n && s.charAt(i) != ' '){
                word.append(s.charAt(i));
                i++;
            }
            word.reverse();
            ans.append(" "+word);
        }
        return ans.substring(1).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets");
        String str = sc.nextLine();
        String s = pallindrome(str);
        System.out.println(s);
        sc.close();
    }
    
}
