public // https://leetcode.com/problems/jump-game
class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        for(int i=0;i<nums.length-1 && i<=reachable;i++){
            if(nums[i]+i>reachable) reachable=nums[i]+i;
        }
        return reachable>=nums.length-1;
    }
}
/*
Problem:-
    1. Intially at first index
    2. Each element represents max jump
    3. Didn't understand whether to include the first index or not initially
Solution:-
    1. Added nums[i]+i to know the max_reachable index
Missed Cases:-
    1. Didn't account for the i<=reachable condition
*/ {
  
}
