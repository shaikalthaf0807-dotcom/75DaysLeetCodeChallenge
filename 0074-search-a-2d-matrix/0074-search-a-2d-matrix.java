class Solution {

    boolean binarySearch(int[][] matrix, int target, int low, int high){
        if(low > high) return false;

        int n= matrix[0].length;
        int mid= (low + high)/2;

        int row = mid / n;
        int col = mid % n;

        if(matrix[row][col] == target) return true;
        else if(matrix[row][col] > target) return binarySearch(matrix,target,low,mid-1);
        else return binarySearch(matrix,target,mid+1,high);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        return binarySearch(matrix, target, 0, m*n - 1);
    }
}