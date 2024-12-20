class Solution {
    public void setZeroes(int[][] matrix) {
        
       int n = matrix.length;    // Number of rows
        int m = matrix[0].length; // Number of columns
        
        // Step 1: Create two auxiliary arrays to mark rows and columns
        int[] rowMarker = new int[n];
        int[] colMarker = new int[m];
        
        // Step 2: Traverse the matrix to mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowMarker[i] = 1; // Mark the current row
                    colMarker[j] = 1; // Mark the current column
                }
            }
        }
        
        // Step 3: Traverse the matrix again and set cells to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rowMarker[i] == 1 || colMarker[j] == 1) {
                    matrix[i][j] = 0; // Set the cell to 0
                }
            }
        }
        
    }
}