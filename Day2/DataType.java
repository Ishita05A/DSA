package Day2;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int value");
        int a = sc.nextInt();
        System.out.println("Enter float value");
        float b = sc.nextFloat();
        System.out.println("Enter double value");
        double c = sc.nextDouble();
        System.out.println("Enter byte value");
        byte d = sc.nextByte();
        System.out.println("Enter long value");
        long e = sc.nextLong();
        double p = a / b;
        double q = a / d;
        double r = c / b;
        int s = d / a;
        double t = e / a;
        System.out.println(p + " " + q + " " + r + " " + s + " " + t + " ");
        sc.close();
    }
}
