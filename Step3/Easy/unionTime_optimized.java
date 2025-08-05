package Step3.Easy;
import java.util.ArrayList;
import java.util.Scanner;
public class unionTime_optimized {
    static ArrayList<Integer> union(int[] a, int[] b){
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                if(al.isEmpty() || al.get(al.size()-1)!=a[i]) al.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                if(al.isEmpty() || al.get(al.size()-1)!=b[j]) al.add(b[j]);
                j++;
            }
            else{
                if(al.isEmpty() || al.get(al.size()-1)!=a[i]) al.add(a[i]);
                i++;
            }
            
        }
        while(i<a.length){
                if(al.isEmpty() || al.get(al.size()-1)!=a[i]) al.add(a[i]);
                i++;
            }
            while(j<b.length){
                if(al.isEmpty() || al.get(al.size()-1)!=b[j]) al.add(b[j]);
                j++;
            }
        return al;
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
        ArrayList<Integer> a = union(arr1, arr2);
        System.out.println(a);
        sc.close();
    }
}
