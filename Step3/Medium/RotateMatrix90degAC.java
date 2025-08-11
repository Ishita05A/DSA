package Step3.Medium;

import java.util.Scanner;

public class RotateMatrix90degAC {
    static void display(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverse(int[] arr){
        int i = 0; 
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] mat){
        int m = mat.length;
        for(int i = 0;i<m; i++){
           reverse(mat[i]);
        }
        for(int i = 0; i<m;i++){
            for(int j = 0; j<=i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

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
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
        display(arr);
        sc.close();
        
    }
    
}
