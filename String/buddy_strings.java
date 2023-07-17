// https://leetcode.com/problems/buddy-strings/
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i))) return true;
                set.add(s.charAt(i));
            }
            return false;
        }
        
        int count = 0;
        char[] diff = new char[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(++count==1){
                    diff[0] = s.charAt(i);
                    diff[1] = goal.charAt(i);
                }
                if(count==2){
                    if(diff[0]!=goal.charAt(i) || diff[1]!=s.charAt(i)){
                        return false;
                    }
                }
                if(count == 3) return false;
            }
        }
        return count != 1;
    }
}