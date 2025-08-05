package Step3.Easy;


import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElement {
    static ArrayList<Integer> unique(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> a = new ArrayList<>();
        int[] freq = new int[100005];
         for(int i = 0; i<n1;i++){
            freq[arr1[i]]++;
         }
         for(int i = 0; i<n2; i++){
            freq[arr2[i]]++;
         }
         for(int i = 0;i<n1;i++){
            if(freq[arr1[i]] == 1){
                a.add(arr1[i]);
                freq[arr1[i]] = 0;
            } 
         }
         for(int i = 0;i<n2;i++){
            if(freq[arr2[i]] == 1){
                a.add(arr2[i]);
            }
        }
                 return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n1 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter no. of elements");
        int n2 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> a = unique(arr1, arr2);
        System.out.println(a);
        sc.close();

    }
    
}
