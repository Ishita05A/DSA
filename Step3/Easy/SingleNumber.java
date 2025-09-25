package Step3.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    static int findSingleNumber(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 0;
        for(int e : arr){
            if(!mp.containsKey(e)) mp.put(e, 1);
            else mp.put(e,mp.get(e)+1);
        }
        for(var num : mp.entrySet()){
            if(num.getValue() == 1)  ans = num.getKey();
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSingleNumber(arr));
        sc.close();

    }
    
}
