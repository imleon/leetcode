public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        if (n == 0) {
            return;
        }
        int p = m - 1;
        int q = n - 1;
        while (p >= 0 && q >= 0) {
            if (A[p] < B[q]) {
                A[p + q + 1] = B[q];
                q --;
            } else {
                A[p + q + 1] = A[p];
                p --;
            }
        }
        if (p >= 0) {
            return;
        }
        while (q >= 0) {
            A[q] = B[q];
            q --;
        }
    }
}

