// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, count = 0;
        HashSet<Character> set = new HashSet<Character>(); 
        for(int i=0; i<s.length();i++){
            count = 0;
            set.clear();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(s.charAt(j));
                count++;
            }
            ans = count>ans?count:ans;
        }
        return ans;
    }
}