public class Solution {
    public int singleNumber(int[] A) {
        int c = 0;
        for (int a : A) {
            c ^= a;
        }
        return c;
    }
}

