// https://leetcode.com/problems/merge-sorted-array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}

/*
Problem :-
    1. Ascending order
    2. In-place sorting in nums1

Logic :- 
    1. Traverse from the back to avoid swap operation
    2. 3 pointers - one for each array + one for current position

Missed Cases :-
    1. When m=0 but n=1 (was having check on i>=0 && j>=0)
*/