class Solution {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
//                    break; // here we will not break because if we will break here then it will increase the i value and we wont get good pairs.
                }
            }
        }

        return count;
    }
}