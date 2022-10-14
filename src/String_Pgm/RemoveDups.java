package String_Pgm;

public class RemoveDups {


    public static void main(String[] args) {
        String str  = "zvvxovs";
        String ans = removeDups(str);
        System.out.println(ans);
    }

    // splitting and saving the string in a reverse manner
    static String removeDups(String S)
    {
        String s = "";
        int[] arr = new int[256];
        for (int i=0;i<S.length();i++){
            arr[S.charAt(i)] += 1;
        }

        for (int i=0;i<S.length();i++){
            if(arr[S.charAt(i)] > 0){
                s =s + S.charAt(i);
                arr[S.charAt(i)] = 0;
            }
        }
        return s;
    }
}
