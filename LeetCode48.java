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
}

//----------Optimized approach--------


