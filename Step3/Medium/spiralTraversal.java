package Step3.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class spiralTraversal {
    static ArrayList<Integer> spiral(int[][] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int no_Of_element = 0;
        int m = arr.length;
        int n = arr[0].length;
        int lc = 0 , rc = n-1, tr = 0, br = m-1;
        while (no_Of_element<m*n) {
            for(int i = lc; no_Of_element<m*n && i<=rc;i++){
                al.add(arr[tr][i]);
                no_Of_element++;
            }
            tr++;
            for(int i = tr; no_Of_element<m*n && i<=br;i++){
                al.add(arr[i][rc]);
                no_Of_element++;
            }
            rc--;
            for(int i = rc; no_Of_element<m*n && i>=lc;i--){
                al.add(arr[br][i]);
                no_Of_element++;
            }
            br--;
            for(int i = br; no_Of_element<m*n && i>=tr;i--){
                al.add(arr[i][lc]);
                no_Of_element++;
            }
            lc++;
        }
        return al;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = sc.nextInt();
        System.out.println("Enter columns");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(spiral(arr));
        sc.close();
    }

}
