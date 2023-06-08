// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, min = prices[0];
        for(int current:prices){
            if(current - min > ans){
                ans = current - min;
            }else if(current < min){
                min = current;
            }
        }
        return ans;
    }
}