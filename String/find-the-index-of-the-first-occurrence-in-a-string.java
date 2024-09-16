// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
  public int strStr(String haystack, String needle) {
      int len=needle.length();
      for(int i=0;i<=haystack.length()-len;i++){
          if(needle.equals(haystack.substring(i,i+len))) return i;
      }
      return -1;
  }
}
/*
Solution:-
  1. Iterate through each letter of haystack and check if the substring is equal to needle
  2. Do it till the length of haystack - length of needle
*/