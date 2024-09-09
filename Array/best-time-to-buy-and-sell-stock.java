// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=prices[0],profit=0;
        for(int price: prices){
            if(price<min) min=max=price;
            if(price>max){
                max=price;
                profit=profit>max-min?profit:max-min;
            }
        }
        return profit;
    }
}

/*
Problem:
    1. Maximize profit
    2. case: 5,10,15; 10,5,20,10

Solution:
    1. tried min,max iterating through whole array but iterated twice
        using i & j pointers i.e. used two loops
    2. solved it simply then
*/
