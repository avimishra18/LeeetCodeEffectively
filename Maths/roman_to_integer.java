// https://leetcode.com/problems/roman-to-integer/
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

        int sum = 0,len=s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i); 
            if(i!=len-1){
                char next = s.charAt(i+1);
                if(c=='I'){
                    if(next=='V'){
                        sum += 4;
                        i++;
                        continue;
                    }else if(next=='X'){
                        sum += 9;
                        i++;
                        continue;
                    }
                }else if(c=='X'){
                    if(next=='L'){
                        sum += 40;
                        i++;
                        continue;
                    }else if(next=='C'){
                        sum += 90;
                        i++;
                        continue;
                    }
                }else if(c=='C'){
                    if(next=='D'){
                        sum += 400;
                        i++;
                        continue;
                    }else if(next=='M'){
                        sum += 900;
                        i++;
                        continue;
                    }
                }
            }
            sum+=map.get(c);
        }
        return sum;
    }
}