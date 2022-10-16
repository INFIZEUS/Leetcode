class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int row = 0; row < image.length; row++) {
                int end = image[row].length - 1;
                int j = 0;
                while (j < end) {
                    int temp = image[row][j];
                    image[row][j] = image[row][end];
                    image[row][end] = temp;
                    j++;
                    end--;
                }
            }
        for (int row = 0; row < image.length; row++) {
            for (int j = 0; j < image[row].length; j++) {
                if (image[row][j] == 1)
                    image[row][j] = 0;
                else
                    image[row][j] = 1;
            }
        }
            return image;
    }
}