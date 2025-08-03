import java.util.Scanner;

public class selectionSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void selection_Sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_idx]) min_idx = j;
            }
            swap(arr, i, min_idx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selection_Sort(arr);
        display(arr);
        sc.close();
    }
    
}
