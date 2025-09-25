package Step3.Easy;
import java.util.Scanner;
import java.util.TreeSet;

public class UnionOfArray {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] findUnion(int[] arr1,int[] arr2){
        
       TreeSet<Integer> mp = new TreeSet<>();
        for(int i : arr1) if(!mp.contains(i)) mp.add(i);
        for(int i : arr2) if(!mp.contains(i)) mp.add(i);
        int[] ans = new int[mp.size()];
        int k = 0;
        for(int i : mp){
            ans[k++] = i;
        }
        return ans;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements");
        int m = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr2 = new int[m];
        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int[] ans = findUnion(arr1, arr2);
        display(ans);
        sc.close();

    }
    
}
