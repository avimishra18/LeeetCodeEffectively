// https://leetcode.com/problems/valid-palindrome
class Solution {
    public boolean isPalindrome(String s) {
        String inp = s.replaceAll("[^A-Za-z\\d]","").toLowerCase();
        int len = inp.length();
        for(int i=0;i<len/2;i++){
            if(inp.charAt(i)!=inp.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}