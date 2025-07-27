package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countFreq_Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map< Integer, Integer> mp = new HashMap<>();
        for(var e : arr){
            if(!mp.containsKey(e)){
                mp.put(e,1);
            }
            else mp.put(e, mp.get(e)+1);
        }
        System.out.println(mp.entrySet());
        sc.close();

    }
    
}
