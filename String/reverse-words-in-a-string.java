https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        String[] words = new String[splitted.length];
        int indx=0;
        for(int i=splitted.length-1;i>=0;i--){
            if(splitted[i].length()>0){
                words[indx++]=splitted[i];
            }
        }
        return String.join(" ",Arrays.copyOfRange(words,0,indx));
    }
}