public class LeetCode48 {


    //    ou are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//    matrix[n][n]
//
//    we have 2 approach one naive which uses extra space


//    -----Naive approach----------


    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                arr[k++][n - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[i][j];
            }
        }

    }


//----------Optimized approach--------
private void swap1(int[][] mat,int i,int j){
    int temp = mat[i][j];
    mat[i][j] = mat[j][i];
    mat[j][i] = temp;
}
    private void swap2(int[][] mat,int i,int j){
        int n = mat.length;
        int temp = mat[i][j];
        mat[i][j] = mat[i][n-1-j];
        mat[i][n-1-j] = temp;
    }

    public void rotateOptimized(int[][] matrix) {
        int n  = matrix.length;

        for(int i=0;i<matrix.length;i++){
            for(int j = i+1;j<matrix[i].length;j++){
                swap1(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<(matrix[i].length/2);j++){
                swap2(matrix,i,j);
            }
        }
    }


}