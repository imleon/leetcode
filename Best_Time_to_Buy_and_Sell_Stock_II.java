public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int buy = 0;
        int sell = 0;
        
        int i = 0;
        while(i < len) {
            int nextLowPos = findNextPos(prices, i, true);
            if (nextLowPos == len - 1) {
                return profit;
            }
            buy = prices[nextLowPos];
            i = nextLowPos + 1;
            
            int nextHighPos = findNextPos(prices, i, false);
            sell = prices[nextHighPos];
            profit += sell - buy;
            i = nextHighPos + 1;
        }
        return profit;
    }
    public int findNextPos(int[] prices, int startPos, boolean isLow) {
        int len = prices.length;
        while(startPos < len - 1) {
            int cur = prices[startPos];
            int next = prices[startPos + 1];
            if (isLow && cur >= next || !isLow && cur <= next) {
                startPos ++;
            } else {
                break;
            }
        }
        return startPos;
    }
}

