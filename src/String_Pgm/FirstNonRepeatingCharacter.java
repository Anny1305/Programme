package String_Pgm;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str  = "geeksforgeeks";
        System.out.println(nonRepeatingCharacter(str));
    }

    static char nonRepeatingCharacter(String S)
    {
        char ans  = '$';
        int[] arr = new int[256];

        for (int i=0; i< S.length(); i++){
            char ch = S.charAt(i);
            arr[ch] += 1;
        }

        for (int i = 0; i< S.length(); i++){
            if (arr[S.charAt(i)] == 1){
                return S.charAt(i);
            }
        }

        return ans;
    }
}
