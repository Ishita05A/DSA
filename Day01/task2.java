package Day01;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m) System.out.println("lesser");
        else if(n==m) System.out.println("Equal");
        else System.out.println("lesser");
    }
}
