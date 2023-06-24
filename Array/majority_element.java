// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                int oldCount = map.get(num);
                if(oldCount >= nums.length/2){
                    return num;
                } 
                map.put(num,oldCount+1);
            }else{
                map.put(num,1);
            }
        }
        return nums[0];
    }
}