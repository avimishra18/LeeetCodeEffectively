//https://leetcode.com/problems/longest-common-prefix/solutions/3273176/python3-c-java-19-ms-beats-99-91/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0; i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return first.substring(0,i);
            }
        }
        return first;
    }
}