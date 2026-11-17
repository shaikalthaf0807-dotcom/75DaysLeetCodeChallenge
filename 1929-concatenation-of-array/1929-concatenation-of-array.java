class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int num=0;
        for(int i=0;i<nums.length;i++){
            ans[num]=nums[i];
            num++;
        }
        for(int i=0;i<nums.length;i++){
            ans[num]=nums[i];
            num++;
        }
        return ans;
    }
}