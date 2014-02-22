public class Solution {
    public int searchInsert(int[] A, int target) {
        int len = A.length;
        if (len == 0) {
            return 0;
        }
        if (target <= A[0]) {
            return 0;
        }
        int i = 0;
        while(i < len) {
            if (target <= A[i]) {
                return i;
            } else {
                i ++;
            }
        }
        return len;
    }
}

