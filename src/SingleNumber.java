public class SingleNumber {
    public static void main(String[] args) {

       // Given a non-empty array of integers nums, every element appears twice except for one. Find that single one
        int[] x = new int[]{2,2,1};
        int[] x1 = new int[]{4,1,2,1,2};

        int ans  = findSingleNumber(x1);
        System.out.println(ans);

    }

    private static int findSingleNumber(int[] x) {
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<x.length; i++){
            boolean isMultiple = false;
            for(int j=0; j<x.length; j++){
                if ((x[i] == x[j]) && (i != j)){
                    isMultiple = true;
                    break;
                }
            }

            if (isMultiple){
                continue;
            }
             ans  = x[i];
        }
        return ans;
    }
}
