class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(map.containsKey(temp)){
                return true;
            }else{
                map.put(temp,1);
            }
        }
        return false;
}
}