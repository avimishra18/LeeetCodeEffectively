//https://leetcode.com/problems/longest-common-prefix/solutions/3273176/python3-c-java-19-ms-beats-99-91/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        for(int i=1;i<strs.length && sb.length() !=0;i++){
            String curr = strs[i];
            if(sb.length()>curr.length()){
                sb.setLength(curr.length());
            }
            for(int j=0;j<sb.length();j++){
               if(curr.charAt(j) != sb.charAt(j)){
                    if(sb.length() > 0){
                        sb.setLength(j);
                    }
                   break;
               } 
            }
        }
        return sb.toString();
    }
}