// https://leetcode.com/problems/rotate-array/
class Solution {

    private void reverse(int[] nums, int start, int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }

    public void rotate(int[] nums, int k) {
       int _k=k%nums.length, n=nums.length-1;
       if(n==0) return;
       reverse(nums,0,n-_k);
       reverse(nums,n-_k+1,n);
       reverse(nums,0,n);
    }
}
/*
Problems:-
    1. right shift array by k positions
Solution:-
    1. by brute force copy elements into another array
    2. Optimized: reverse array
*/