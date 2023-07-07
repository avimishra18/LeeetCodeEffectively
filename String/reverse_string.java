// https://leetcode.com/problems/reverse-string
class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp = s[j];
            s[j]=s[i];
            s[i]=temp;
        }
    }
}