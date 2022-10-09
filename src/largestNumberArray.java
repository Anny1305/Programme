import java.util.Arrays;
import java.util.Comparator;

public class largestNumberArray {


    public static void main(String[] args) {
        int[] arr = new int[]{3,30};
        String ans = largestNumArray(arr);
        System.out.println(ans);

    }

    public static String largestNumArray(int[] arr){

        String ans  = "";

         long val = Long.MAX_VALUE;
        // 1. convert to string array
        String strArr [] = new String[arr.length];
        for (int i=0;  i<arr.length; i++){
            strArr[i] = arr[i]+"";
        }

        // sort the array by custom comparator
        // 3,30

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2; // 303
                String s2 = o2+o1; // 330
                System.out.println("s1: "+s1 + " s2: "+s2 +" vsl: "+s1.compareTo(s2));
                // if s1 > s2 return +1
                return -s1.compareTo(s2);
            }
        });
         for (String s: strArr){
             ans += s;
         }
      return ans;
    }
}
