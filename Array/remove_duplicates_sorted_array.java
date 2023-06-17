// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0, k=1;
        for(int right=1;right<nums.length;right++){
            if(nums[right]!=nums[left]){
                nums[++left] = nums[right];
                k++;
            }
        }
        return k;
    }
}