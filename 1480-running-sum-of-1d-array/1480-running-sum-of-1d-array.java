class Solution {
    public static int[] runningSum(int[] arr) {
//        int[] sum = new int[arr.length];
        for (int i = 1; i < arr.length; ++i) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}