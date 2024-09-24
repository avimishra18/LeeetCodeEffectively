// https://leetcode.com/problems/product-of-array-except-self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int mult=1, zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroCount++;
            else mult*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount>0){
                if(nums[i]==0) ans[i]=zeroCount>1?0:mult;
                else ans[i]=0;
            }else ans[i]=mult/nums[i];
        }
        return ans;
    }
}
/*
Solution:-
    1. Brute force:- just multiply all other values
    2. Maintain hasZero solution
Missed Cases:-
    1. Maintain the count instead
*/