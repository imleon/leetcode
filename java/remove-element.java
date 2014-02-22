public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        int cnt = 0;
        for (int i = 0; i < len; i ++) {
            if (A[i] == elem) {
                cnt ++;
            } else if (cnt > 0) {
                A[i - cnt] = A[i];
            }
        }
        return len - cnt;
    }
}

