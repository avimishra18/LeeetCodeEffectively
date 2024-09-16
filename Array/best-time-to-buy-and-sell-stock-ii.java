// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
class Solution {
    
  int[] memo;

  private int maxProfit(int[] prices, int start){
      if(memo[start]!=-1) return memo[start];
      int profit=0;
      for(int i=start;i<prices.length-1;i++){
          for(int j=i+1;j<prices.length;j++){
              if(prices[j]>prices[i]){
                  int transaction=prices[j]-prices[i];
                  int postTransactionProfit=0;
                  if(memo[j+1]!=-1){
                      postTransactionProfit=memo[j+1];
                  }else{
                      postTransactionProfit=maxProfit(prices,j+1);
                      memo[j+1]=postTransactionProfit;
                  }
                  profit=Math.max(profit,transaction+postTransactionProfit);
              }
          }
      }
      return profit;
  }

  public int maxProfit(int[] prices) {
      memo=new int[prices.length+1];
      Arrays.fill(memo, -1);
      return maxProfit(prices,0);
  }
}

/*
Solution:-
  1. Used recursion to break the problem into smaller part
  2. Passed map to use dynamic programming
  3. Changed the map to int[] to solve the problem
*/