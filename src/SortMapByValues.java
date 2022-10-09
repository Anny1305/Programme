import sun.awt.image.ImageWatched;

import java.util.*;

public class SortMapByValues {


    public static void main(String[] args) {

        String str = "helloworld";
        Map<Character, Integer> mp = new HashMap();
        List<Map.Entry<Character, Integer>> lst = new ArrayList<>();

        for (int i =0; i<str.length(); i++){
            mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> entrySet : mp.entrySet()){
                lst.add(entrySet);
        }

        System.out.println(lst);


        Collections.sort(lst, new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> m1, Map.Entry<Character,Integer> m2){
                if (m1.getValue().compareTo(m2.getValue()) == 0){
                    return m1.getKey().compareTo(m2.getKey());
                }
                return m2.getValue().compareTo(m1.getValue());
            }
        });
        System.out.println(lst);

        Map<Character,Integer> linkedMap = new LinkedHashMap();
        for (Map.Entry<Character,Integer> mE : lst) {
            linkedMap.put(mE.getKey(), mE.getValue());
        }
        System.out.println(lst);
    }
}
