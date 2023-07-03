// https://leetcode.com/problems/binary-search/
class Solution {
    public int binarySearch(int[] nums, int target, int low, int high){
        int mid = (low+high)/2;
        if(target==nums[mid]){
            return mid;
        }
        if(low>=high){
            return -1;
        }
        if(target<nums[mid]){
            return binarySearch(nums,target,low,mid-1);
        }
        return binarySearch(nums,target,mid+1,high);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
}