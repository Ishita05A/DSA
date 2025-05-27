package Day01;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value");
        int n=sc.nextInt();
        System.out.println("Enter 2nd value");
        int m=sc.nextInt();
        if(n<m) System.out.println("lesser");
        else if(n==m) System.out.println("Equal");
        else System.out.println("lesser");
        sc.close();
    }
}
