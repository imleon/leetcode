public class Solution {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        int i = 2;
        int cur = 1;
        int last = 1;
        while(i <= n) {
            int next = cur + last;
            last = cur;
            cur = next;
            i ++;
        }
        return cur;
    }
}

