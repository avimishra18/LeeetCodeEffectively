// https://leetcode.com/problems/search-insert-position/
class Solution {
    public int search(int[] n, int t, int l, int h){
        int m=(l+h)/2;
        if(t==n[m]){
            return m;
        } 
        if(l>=h){
            return t>n[m]?m+1:m;
        }
        if(t<n[m]){
            return search(n,t,l,m-1);
        }
        return search(n,t,m+1,h);
    }

    public int searchInsert(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
}