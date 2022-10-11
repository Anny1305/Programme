package String_Pgm;

public class StrStr {

    // Your task is to implement the function strstr.
    // The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
    // The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
    //    s = GeeksForGeeks, x = For
    //    Output: 5
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
