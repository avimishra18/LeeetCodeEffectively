// https://leetcode.com/problems/roman-to-integer
class Solution {
  public int romanToInt(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);

      int i=0,sum=0;
      for(i=0;i<s.length()-1;i++){
          char curr = s.charAt(i);
          char next = s.charAt(i+1);
          if((curr == 'I' && (next == 'V' || next == 'X')) || 
              (curr == 'X' && (next == 'L' || next == 'C')) ||
              (curr == 'C' && (next == 'D' || next == 'M'))
          ){
              sum+=map.get(next)-map.get(curr);
              i++;
          }else{
              sum+=map.get(curr);
          }
      }
      if(i<s.length()){
          sum+=map.get(s.charAt(i));
      }
      return sum;
  }
}
/*
Problem:-
  1. Convert Roman to Integer
Solution:-
  1. Hashmap to store the values
  2. Explicit if check for 6 instances
Missed Cases:-
  1. Was not having i<s.length() check for the last character 
      IV then there will be an extra i++ 
*/