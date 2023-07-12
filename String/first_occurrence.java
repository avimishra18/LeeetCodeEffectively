// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    if(j==needle.length()-1) return i;
                }else{
                    break;
                }         
            }
        }
        return -1;
    }
}