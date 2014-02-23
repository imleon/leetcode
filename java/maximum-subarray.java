public class Solution {
    public int maxSubArray(int[] A) {
        int max = 0;
        int sum = 0;
        
        int len = A.length;
        if (len == 0) {
            return 0;
        } else {
            max = A[0];
        }

        int i = 0;
        while(i < A.length) {
            sum += A[i];
            if (A[i] >= 0) {
                max = sum > max ? sum : max;
            } else {
                max = A[i] > max ? A[i] : max;
                if (sum < 0) {
                    sum = 0;
                }
            }
            i ++;
        }
        return max;
    }
}

