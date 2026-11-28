class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        double maxAvg=0;
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }
        double avgCal=maxSum/k;
        maxAvg=avgCal;
        
        for(int i=k;i<nums.length;i++){
            maxSum=maxSum+nums[i]-nums[i-k];
            avgCal=maxSum/k;
            if(avgCal>maxAvg){
                maxAvg=avgCal;
            }
        }
        return maxAvg;
    }
}