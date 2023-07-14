// https://leetcode.com/problems/contains-duplicate-ii/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0,j=0;i<nums.length;i++,j++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(j>=k){
                set.remove(nums[j-k]);
            }
        }
        return false;
    }
}