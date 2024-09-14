// https://leetcode.com/problems/length-of-last-word
class Solution {
  public int lengthOfLastWord(String s) {
      String[] splitted = s.split(" ");
      return splitted[splitted.length-1].length();
  }
}