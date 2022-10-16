class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int counter = 0;

        for (int i = 0; i < indices.length; i++) {
            int[] k = indices[i];
            row[k[0]]++;
            col[k[1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    counter++;
            }
        }
        return counter;
    }
}