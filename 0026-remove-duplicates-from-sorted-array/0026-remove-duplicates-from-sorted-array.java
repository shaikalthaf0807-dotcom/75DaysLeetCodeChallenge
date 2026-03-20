class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=0;
        for(int ele:set){
            nums[i++] = ele;
        }
        return set.size();
    }
}