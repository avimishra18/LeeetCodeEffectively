// https://leetcode.com/problems/remove-element
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,k=0;
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j--]=val;
                k++;
            }else{
                i++;
            }
        }
        return nums.length - k;
    }
}

/*
Problem :-
1. Remove all occurances of val in nums (in-place)
2. Order doesn't matter

Solution :-
1. 2 pointers - one for current position and one for last position

Missed Cases :-
1. while loop condition
2. while loop did (i<j) instead of (i<=j) condition
3. Misread the problem statement and returned k instead of nums.length - k

*/