// https://leetcode.com/problems/roman-to-integer
class Solution {
  public int romanToInt(String s) {
      int prev=0,sum=0,num=0;
      for(int i=s.length()-1;i>=0;i--){
          switch(s.charAt(i)){
              case 'M' -> num=1000;
              case 'D' -> num=500;
              case 'C' -> num=100;
              case 'L' -> num=50;
              case 'X' -> num=10;
              case 'V' -> num=5;
              case 'I' -> num=1;
          }
          if(prev>num) sum-=num; 
          else sum+=num;
          prev=num;
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
  3. Second approach :- iterate array in reverse check prev value
Missed Cases:-
  1. Was not having i<s.length() check for the last character 
      IV then there will be an extra i++ 
*/