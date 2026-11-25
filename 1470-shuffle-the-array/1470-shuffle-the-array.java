class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        int index=1;
        for(int i=n;i<nums.length;i++){
            list.add(index,nums[i]);
            index+=2;
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}