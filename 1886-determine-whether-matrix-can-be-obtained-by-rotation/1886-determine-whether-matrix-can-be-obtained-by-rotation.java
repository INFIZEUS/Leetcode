class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Swapping elements
        for (int i = 0; i < 5; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            else
                mat = rotate(mat);
        }
        return false;
    }
    // Transposing the Matrix
    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
    
}