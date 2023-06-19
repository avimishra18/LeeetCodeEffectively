// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int prev = map.get(s.charAt(0));
        for(int i=0;i<s.length();i++){
            int curr = map.get(s.charAt(i));
            if(prev<curr){
                sum-=2*prev;
            }
            sum+=curr;
            prev=curr;
        }
        return sum;
    }
}