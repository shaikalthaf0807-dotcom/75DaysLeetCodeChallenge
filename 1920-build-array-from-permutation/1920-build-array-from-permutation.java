class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val1=nums[i];
            int val2=nums[val1];
            ans[i]=val2;
        }
        return ans;
    }
}