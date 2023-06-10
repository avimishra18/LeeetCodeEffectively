https://leetcode.com/problems/top-k-frequent-elements
class Solution {

    class Occurances implements Comparable<Occurances> {
        public int num;
        public int count;

        public Occurances(int num, int count){
            this.num = num;
            this.count = count;
        }
        
        @Override
        public int compareTo(Occurances occ){
            return occ.count - this.count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        PriorityQueue<Occurances> queue = new PriorityQueue<>(map.size());
        for (int key:map.keySet()) {
            queue.add(new Occurances(key,map.get(key)));
        }
        map.clear();
        for(int i=0; i<k; i++){
            ans[i] = queue.remove().num;
        }
        return ans;
    }
}