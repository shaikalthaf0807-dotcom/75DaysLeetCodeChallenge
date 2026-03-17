class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int[] answer=new int[k];
        
        for(int i=0;i<k;i++){
            int maxKey=0;
            int maxFreq=0;
            for(int key:map.keySet()){
                if(map.get(key)>maxFreq){
                    maxFreq=map.get(key);
                    maxKey=key;
                }
            }
            answer[i]=maxKey;
            map.remove(maxKey);
        }
        return answer;
    }
}