package Step5.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character, Character> mp = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!mp.containsKey(original)){
                if(!mp.containsValue(replacement)){
                    mp.put(original,replacement);
                }
                else return false;
            }
            else{
                char mappedChar = mp.get(original);
                if(mappedChar != replacement) return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();
         System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();
        System.out.println(isIsomorphic(s1, s2));
        sc.close();
    }
}
