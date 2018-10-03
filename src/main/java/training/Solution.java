package training;

import lombok.NonNull;


public class Solution {


    private void method(int v, @NonNull String z) {
        System.out.println(v);

        System.out.println(z);


    }


    public static void main(String[] args) {
        String bb = null;
        Solution solution = new Solution();
        solution.method(54, bb);

    }


}
