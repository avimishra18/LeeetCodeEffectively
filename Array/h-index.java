// https://leetcode.com/problems/h-index/
class Solution {
    public int hIndex(int[] citations) {
        int matches=0,h=0;
        do{
            int curr=h+1;
            matches=0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=curr) { 
                    matches++;
                    if(matches>=curr) {
                        h=curr;
                        break;
                    };
                }
            }
            if(matches<curr) break;
        }while(true);
        return h;
    }
}
/* 
Problem:-
    1. h papers must be cited h times - find max h
    2. brute force :- start from 0 to max value => iterate whole array O(n*h)

*/