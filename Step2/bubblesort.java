import java.util.Scanner;

public class bubblesort {
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
    static void bubble_Sort(int[] arr){

        int n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubble_Sort(arr);
        display(arr);
        sc.close();
    }
    
}
