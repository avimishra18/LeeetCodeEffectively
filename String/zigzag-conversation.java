// https://leetcode.com/problems/zigzag-conversion/
class Solution {

    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<numRows;i++){
            int j=i;
            while(j<s.length()){
                sb.append(s.charAt(j));
                if(i!=0 && i!=numRows-1){
                    int indx2=j+(numRows-1-i)*2;
                    if(indx2<s.length()) sb.append(s.charAt(indx2));
                }
                j+=(numRows-1)*2;
            }
        }
        return sb.toString();
    }
}
/*
Couldn't understand it that well, initially. 
But had right intuition/approach to solve it.
*/
/*
0,4,8,12 // 4
1,3,5,7,9,11,13 //2
2,6,10 //4
*/

/* => 4
0,6,12 //6 
1,5,7,11,13 //4,2,4,2
2,4,8,10 //2,4,2
3,9 //6
*/

/*
0,8 //8
1,7,9 //6,2
2,6,10 // 4,4
3,5,11,13 //2,6
4,12 //8
*/

/*
P    H
A   SI
Y  I R
P L  IG
A    N
*/