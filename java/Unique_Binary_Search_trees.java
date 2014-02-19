public class Solution {
    public int numTrees(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        return divided(n);
    }
    
    public int divided(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        int ret = 0;
        for(int i = 0; i < n; i ++) {
            ret += divided(i) * divided(n - i - 1);
        }
        return ret;
    }
}

