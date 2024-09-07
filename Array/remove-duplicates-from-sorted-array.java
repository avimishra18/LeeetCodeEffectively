// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            boolean isPresent = false;
            for(int j=0;j<k;j++){
                if(nums[i]==nums[j]) isPresent = true;
            }
            if(!isPresent) nums[k++]=nums[i];
        }
        return k++;
    }
}

/* 
Problem:-
    1. Ascending order array
    2. Relative position matter
    3. Return number of unique elements & change array (in-place)

Solution:-
    1. Use hashset
    2. Unclear on the number & how to use the pointers?

Missed Cases:-
    1. Time limit exceeded 
    2. Runtime only beats 5.77%

Attempt 2: 
    1. Will loop through array once only with 2 pointers
    2. Implemented the HashSet logic using array
*/