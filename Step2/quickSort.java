import java.util.Scanner;

public class quickSort {
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
    static int pivot_element(int[] arr, int st,int end){
        int pivot = arr[st];
        int count = 0;
        for(int i = st+1;i<=end;i++){
            if(arr[i]<=pivot) count++;
        }
        swap(arr, st, count+st);
        pivot = arr[count+st];
        int pi = count+st;
        int i = st;
        int j = end;
        while(i<pi && j>pi){
            if(arr[i] <= pivot) i++;
            if(arr[j] > pivot) j--;
            if(arr[i] > pivot && arr[j]<pivot) swap(arr, i++, j--);
        }
        return pi;

        
    }
    static void Quick_Sort(int[] arr, int st, int end){
        if(st>=end) return;
        int pi = pivot_element(arr, st, end);
        Quick_Sort(arr, st, pi-1);
        Quick_Sort(arr, pi+1, end);
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
        Quick_Sort(arr, 0, n-1);
        display(arr);
        sc.close();
    }
    
}
