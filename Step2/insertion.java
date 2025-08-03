import java.util.Scanner;

public class insertion{
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
    static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j-1, j);
                j--;
            }
            
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
        insertion_sort(arr);
        display(arr);
        sc.close();
    }
}