package String_Pgm;

public class AtoI {

    //Your task  is to implement the function atoi. The function takes a string(str) as argument
    // and converts it to an integer and returns it.
    // --123 -1, -123 -123, 231 -1


    public static void main(String[] args) {

        String x  = "ccdeecbdfedcbabfdfaebdaf";
        String y = "fecfacbccfe";
        int ans = strstr(x,y);
        System.out.println(ans);

    }

    static int strstr(String s, String x) {
        // loop through first string
        for (int i = 0; i < s.length(); i++) {
            boolean isMatched = true;
            int index = i;
            for (int j = 0; j < x.length(); j++) {
                if ((index == s.length()) || (s.charAt(index) != x.charAt(j))) {
                    isMatched = false;
                    break;
                }

                // char is matched
                index++;
            }
            if (isMatched) {
                return index - x.length();
            }
        }
        return -1;
    }
}
