package Day5;

import java.util.Scanner;

public class fibonacci_recursion {
    static int fibo_Series(int n){
        if(n == 0 || n == 1) return n;
        return(fibo_Series(n-1)+fibo_Series(n-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            System.out.print(fibo_Series(i)+" ");
        }
        sc.close();
    }
}
