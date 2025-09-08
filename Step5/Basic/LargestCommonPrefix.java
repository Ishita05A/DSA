package Step5.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class LargestCommonPrefix {
    static String largest_prefix(String[] str){
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();
        for(int i = 0; i<first.length;i++){
            if(first[i] != last[i])
            break;
            result.append(first[i]);

        }
        return result.toString();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        String s = largest_prefix(arr);
        System.out.println(s);
        sc.close();
        

    }
    
}
