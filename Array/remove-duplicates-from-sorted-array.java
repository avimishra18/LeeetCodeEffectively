// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        while(i<nums.length){
            if(set.contains(nums[i])){
                int j=i+1;
                while(j<nums.length){
                    if(!set.contains(nums[j])){
                        set.add(nums[j]);
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                    j++;
                }
                if(j==nums.length) return set.size();
            }else{
                set.add(nums[i]);
            }
            i++;
        }
        return set.size();
    }
}

/* 
Problem:-
    1. Ascending order array
    2. Relative position matter
    3. Return number of unique elements & change array (in-place)

Solution:-
    1. Use hashset
    2. Unclear on how to use the pointers

Missed Cases:-
    1. Time limit exceeded 
    2. Runtime only beats 5.77%
*/