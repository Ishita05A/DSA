package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maxfreq_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for(var e:arr){
            if(!mp.containsKey(e)) mp.put(e, 1);
            else mp.put(e, mp.get(e)+1);
        }
        System.out.println(mp.entrySet());
        int maxFreq = -1;
        int anskey = -1;
        for(var e: mp.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.printf("Maximum freq key is %d with frequency %d ",anskey,maxFreq);
        sc.close();
    }
    
}
