public class Solution {
    public int reverse(int x) {
        if (x < 0) {
            return -reverseActual(-x);
        }
        return reverseActual(x);
    }
    public int reverseActual(int x) {
        int ret = x;
        int len = countLen(x);
        int half = len / 2;
        for(int i = 0; i < len / 2; i ++) {
            int powHigh = power(len - i - 1, 10);
            int powLow = power(i, 10);
            int high = x / powHigh % 10;
            int low = x / powLow % 10;
            ret -= low * powLow + high * powHigh;
            ret += high * powLow + low * powHigh;
        }
        return ret;
    }
    public int power(int pow, int base) {
        int ret = 1;
        for(int i = 0; i < pow; i ++) {
            ret *= base;
        }
        return ret;
    }
    public int countLen(int x) {
        int c = 1;
        while(x >= 10) {
            x /= 10;
            c ++;
        }
        return c;
    }
}

