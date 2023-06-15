// https://leetcode.com/problems/check-if-it-is-a-straight-line/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dy = coordinates[1][1] - coordinates[0][1];
        int dx = coordinates[1][0] - coordinates[0][0];

        for(int i=2;i<coordinates.length;i++){
            if(dy*(coordinates[1][0]-coordinates[i][0])!=dx*(coordinates[1][1]-coordinates[i][1])){
                return false;
            }
        }
        return true;
    }
}