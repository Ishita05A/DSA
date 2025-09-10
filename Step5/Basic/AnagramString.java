package Step5.Basic;
import java.util.Scanner;

public class AnagramString {
    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false; 
        int[] count = new int[26];
        for(int i =0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        for(int i = 0;i<s2.length();i++){
            count[s2.charAt(i) - 'a']--;
        }
        for(int i = 0;i<count.length;i++){
            if(count[i] != 0) return false;
        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2));
        sc.close();
    }
    
}
