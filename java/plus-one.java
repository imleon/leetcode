public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (isBlankOrAllNine(digits)) {
            int[] newdigits = new int[len + 1];
            newdigits[0] = 1;
            for (int i = 1; i < len + 1; i ++) {
                newdigits[i] = 0;
            }
            return newdigits;
        }
        for (int j = len - 1; j >= 0; j --) {
            if (digits[j] == 9) {
                digits[j] = 0;
            } else {
                digits[j] ++;
                break;
            }
        }
        return digits;
    }
    
    public boolean isBlankOrAllNine(int[] digits) {
        int len = digits.length;
        if (len == 0) {
            return false;
        }
        for (int i = 0; i < len; i ++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }
}

