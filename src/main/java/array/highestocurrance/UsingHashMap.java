package array.highestocurrance;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
    public static void main(String[] args) {
        int[] arr = {8,5,2,1,6,1,8,7,6,6,2,8,8,5};
        int len = arr.length;
        mostOcurrance(arr, len);
    }
    static void mostOcurrance(int[] arr, int len) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int c : arr) {
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            } else{
                hm.put(c, 1);
            }
        }

        System.out.println(hm);
        //find max frequency
        int max_count = 0, numb = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(max_count < entry.getValue()){
                max_count = entry.getValue();
                numb = entry.getKey();
            }
        }
        System.out.println(numb+" has occured "+max_count+" times");
    }
}
