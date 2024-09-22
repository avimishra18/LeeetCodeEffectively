// https://leetcode.com/problems/gas-station/
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int maxGas=Integer.MIN_VALUE,init=0,totalGas=0,totalCost=0;
        for(int i=0;i<n;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            if(gas[i]-cost[i]>maxGas){
                maxGas=gas[i]-cost[i];
                init=i;
            }
        }
        if(totalGas<totalCost) return -1;
        for(int start=0;start<n;start=(start+1)%n){
            int gasLeft=gas[start];
            int prev=start;
            while(gasLeft>0){
                int next=(prev+1)%n;
                gasLeft-=cost[prev];
                if(gasLeft<0) break;
                if(start==next) return start;
                gasLeft+=gas[next];
                prev=next;
            }
        }
        return -1;
    }
}
/*
Problem:-
    1. bit long to comprehend
Solution:-
    1. brute force check for all the stations
    2.
*/