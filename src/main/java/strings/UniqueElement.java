package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {

        String str = "Java is high level langauge";
        char[] chars = str.toLowerCase().toCharArray();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        for (Character c : chars) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1); //get(c)+1, have a count of repeated character
            } else {
                hm.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> value : hm.entrySet()) {
            if (value.getValue() == 1) { // == exist element, > print duplicate element
              //  System.out.print(value.getKey());
                   System.out.println(value.getKey() +" : "+value.getValue());
            }
        }
    }
}
