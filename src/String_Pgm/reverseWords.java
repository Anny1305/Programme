package String_Pgm;

public class reverseWords {
    
    public static void main(String[] args) {
        String str  = "i.like.this.program.very.much";
        String ans = reverseWords(str);
        System.out.println(ans);
    }

    // splitting and saving the string in a reverse manner
    static String reverseWords(String S)
    {

        String out = "";
        if (S.trim().length() == 0){
            return out;
        }
        // Get the string array by token
        String[] strArr = S.split("\\.");

        // Loop over string token array and append it to final string with dots
        for (int i=strArr.length-1; i>=0;i--){
            String temp = strArr[i];
            out = out+temp+".";
        }

        // remove trailing dots
        out = out.substring(0, out.length()-1);
        return out;
    }

}
