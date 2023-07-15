// https://leetcode.com/problems/word-pattern/
class Solution {
    public boolean wordPattern(String p, String s) {
        String[] words = s.split(" ");
        if(p.length() != words.length) return false;
        String[] arr = new String[26];
        for(int i=0;i<p.length();i++){
            int indx = p.charAt(i)-97;
            if(arr[indx]==null){
                for(String existingWord: arr){
                    if(words[i].equals(existingWord)) return false;
                }
                arr[indx]=words[i];
            }else if(!arr[indx].equals(words[i])){
                return false;
            }
        }
        return true;
    }
}