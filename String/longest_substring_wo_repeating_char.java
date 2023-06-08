// https://leetcode.com/problems/longest-substring-without-repeating-characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, count = 0, left=0;
        HashSet<Character> set = new HashSet<Character>(); 
        for(int right=0; right<s.length();right++){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                while(left<s.length() && left<=right){
                    if(s.charAt(left)==ch){
                        left++;
                        break;
                    }
                    set.remove(s.charAt(left++));
                    count--;
                }
            }else{
                set.add(ch);
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}