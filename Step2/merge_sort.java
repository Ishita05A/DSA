import java.util.Scanner;

public class merge_sort {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void mergeSort(int[] arr,int st, int end,int mid){
        int n1 = mid-st+1;
        int n2 = end- mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1;i++){
            left[i] = arr[st+i];
        }
        for(int i = 0; i<n2;i++){
            right[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
        int k = st;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];
    }
    static void merge(int[] arr,int st,int end){
        if(st>=end) return;
        int mid = (st+end)/2;
        merge(arr, st, mid);
        merge(arr, mid+1, end);
        mergeSort(arr, st, end, mid);

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
        merge(arr, 0, n-1);
        display(arr);
        sc.close();
        
    }
}
