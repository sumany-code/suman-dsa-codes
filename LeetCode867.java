public class LeetCode867 {


    //Transpose of a matrix(n*n)

    //naive Approach
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int matrix2[][] = new int[c][r];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }
        return matrix2;
    }

    //optimized Approach

    private void swap(int[][] mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    private void transposeEfficient(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j = i+1;j<matrix[i].length;j++){
                swap(matrix,i,j);
            }
        }
    }
}
