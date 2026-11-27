class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // for(int i=0;i<image.length;i++){
        //     for(int left=0,right=image[i].length-1;left<right;left++,right--){
        //         int temp=image[i][left];
        //         image[i][left]=image[i][right];
        //         image[i][right]=temp;
        //     }
        // }
        // for(int i=0;i<image.length;i++){
        //     for(int j=0;j<image[i].length;j++){
        //         if(image[i][j]==0){
        //             image[i][j]=1;
        //         }else{
        //             image[i][j]=0;
        //         }
        //     }
        // }
        // return image;
        int n = image.length;

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;

            while(left <= right){
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}