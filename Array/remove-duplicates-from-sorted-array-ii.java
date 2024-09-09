// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution {
  public int[] leftShift(int[] nums, int start, int end){
      int temp=nums[start];
      for(int j=start;j<end;j++){
          nums[j]=nums[j+1];
      }
      nums[end]=temp;
      return nums;
  }

  public int removeDuplicates(int[] nums) {
      int k=0,count=1;
      for(int i=1;i<nums.length-k;i++){
          if(nums[i]!=nums[i-1]){
              count=1;
          }
          else if(count<2){
              count++;    
          }else{
              nums=leftShift(nums,i,nums.length-1-k);
              count++;
              k++;
              i--;
          }
      }
      return nums.length-k;
  }
}

/*
Problem:-
  1. Ascending order, remove duplicates in place
  2. Each unique element appears max 2 times
  3. Relative order must be correct
  4. Result to be present in first part
  5. Return k (size of final array)
  6. Do not create another array i.e. O(1) memory

Solution:-
  1. Left Shift the array Brute Force solution

Missed Cases:-
  1. In the first if condition reset the count to 0 instead of 1
*/