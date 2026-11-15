class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int west=0,east=numbers.length-1;
        while(west<east){
            if(numbers[west]+numbers[east]==target){
                return new int[]{west+1,east+1};
            }else if(numbers[west]+numbers[east]>target){
                east--;
            }else{
                west++;
            }

        }
        return new int[]{};
    }
}