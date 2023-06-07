// https://leetcode.com/problems/valid-parentheses/submissions/
class Solution {
    public boolean isValid(String s) {
        boolean ans = true;
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsValue(ch)){
                stack.push(ch);
            }else{
                if(stack.size()==0 || stack.pop()!=map.get(ch)){
                    ans = false;
                    break;
                }
            }
        }
        return stack.size()==0?ans:false;
    }
}