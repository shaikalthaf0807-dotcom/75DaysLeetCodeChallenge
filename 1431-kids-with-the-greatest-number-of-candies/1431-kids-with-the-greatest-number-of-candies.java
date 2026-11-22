class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>list=new ArrayList<>();
        int greatestNumber=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>greatestNumber){
                greatestNumber=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
           int totalCandies=candies[j]+extraCandies;
            if(totalCandies<greatestNumber){
                list.add(false);
            }else{
            list.add(true);
            }
        }
        return list;
    }
}