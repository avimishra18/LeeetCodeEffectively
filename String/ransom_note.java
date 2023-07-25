// https://leetcode.com/problems/ransom-note/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for(char ch: magazine.toCharArray()){
            mag[ch-'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            if(mag[ch-'a']>0){
                mag[ch-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}