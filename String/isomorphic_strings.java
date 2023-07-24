// https://leetcode.com/problems/isomorphic-strings/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        for(int i=0;i<s.length();i++){
            if(count1[s.charAt(i)]!=count2[t.charAt(i)]) return false;
            count1[s.charAt(i)] = i+1;
            count2[t.charAt(i)] = i+1;
        }
        return true;
    }
}