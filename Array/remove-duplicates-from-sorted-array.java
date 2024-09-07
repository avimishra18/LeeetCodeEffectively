// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i] != nums[i-1]){
                nums[k]=nums[i];
                k++;
           }
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

Attempt 3:
    1. Didn't focus on the fact that array is already sorted
*/