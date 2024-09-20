// https://leetcode.com/problems/h-index/
class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] count=new int[n+1];
        for(int citation:citations){
            if(citation>=n){
                count[n]++;
            }else{
                count[citation]++;
            }
        }
        int sum=0;
        for(int i=n;i>=0;i--){
            sum+=count[i];
            if(sum>=i) return i; 
        }
        return 0;
    }
}
/* 
Problem:-
    1. h papers must be cited h times - find max h
    2. brute force :- start from 0 to max value => iterate whole array O(n^2)
Solution:-
    1. Maintain count bucket 
*/