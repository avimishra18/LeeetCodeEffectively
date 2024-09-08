// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            Integer currentCount = map.get(i);
            if(currentCount==null){
                map.put(i,1);
            }else{
                map.put(i,currentCount+1);
            }
        }
        int val=nums[0], count=1;
        for (int key : map.keySet()) {
            if(map.get(key) > count){
                val=key;
                count=map.get(key);
            }
        }
        return val;
    }
}

/* 
Problem:-
    1. Always existing majority element
    2. It's appears more than n/2 times

Solution:-
    1. Use HashMap
*/

/* 
Problem:-
    1. Always existing majority element
    2. It's appears more than n/2 times

Solution:-
    1. Use HashMap
*/