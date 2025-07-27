package Day5;

import java.util.Scanner;

public class nth_fibo_recursion {
    static int nthTerm(int n){
        if(n ==0 || n==1) return n;
        return (nthTerm(n-1)+nthTerm(n-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms");
        int n = sc.nextInt();
        System.out.println(nthTerm(n));
        sc.close();
    }
    
}
