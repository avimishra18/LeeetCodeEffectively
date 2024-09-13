// https://leetcode.com/problems/longest-common-prefix
class Solution {
  public String longestCommonPrefix(String[] strs) {
      StringBuffer common = new StringBuffer(strs[0]);
      for(int i=1;i<strs.length;i++){
          int currLen = strs[i].length();
          for(int j=0;j<common.length();j++){
              if(j==currLen || strs[i].charAt(j)!=common.charAt(j)){
                  common.delete(j,common.length());
                  break;
              }
          }
      }
      return common.toString();
  }
}
/*
Missed Cases:-
  1. Used int lastPosition with String to keep a track but complicated the problem
  2. Switched to StringBuffer solved most of the issues
  3. Failed ["ab", "a"] test case as didn't check j==currLen 
*/