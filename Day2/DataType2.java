package Day2;

import java.util.Scanner;

public class DataType2 {
    static int javaIntType(Scanner sc) {
        System.out.println("Enter integer value");
        return sc.nextInt();
    }

    static float javaFloatType(Scanner sc) {
        System.out.println("Enter float value");
        return sc.nextFloat();
    }

    static String javaStringType(Scanner sc) {
        System.out.println("Enter String ");
        sc.nextLine();
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(javaIntType(sc));
        System.out.println(javaFloatType(sc));
        System.out.println(javaStringType(sc));
        sc.close();

    }

}
