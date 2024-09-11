// https://leetcode.com/problems/rotate-array/
class Solution {
  public void rotate(int[] nums, int k) {
      int[] temp=Arrays.copyOf(nums, nums.length);
      for(int i=0;i<temp.length;i++){
          nums[(i+k)%nums.length]=temp[i];
      }
      return;
  }
}
/*
Problems:-
  1. right shift array by k positions
Solution:-
  1. by brute force copy elements into another array
*/