import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=  sc.nextInt();
        }

        // pre-compute frequency using HashMap
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        // iterate in the map
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            System.out.println(it.getKey()+"->"+ it.getValue());
        }

        // Store frequency of each element
        int q = sc.nextInt();
        while(q-- > 0){
            int num = sc.nextInt();
            System.out.println(mp.getOrDefault(num,0));
        }
    }
}
