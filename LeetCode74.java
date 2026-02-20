public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low =0;
        int high = (m*n-1);

        while(low<=high){
            int mid = (low+high)/2;
            int mid1 = (mid/n);
            int mid2 = (mid%n);

            if(matrix[mid1][mid2]==target){
                return true;
            }
            else if(matrix[mid1][mid2]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return false;
    }
}
