class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[nums.length];
//         for(int i = 0; i <= nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                  if (nums[i] + nums[j] == target) {
//                 return new int[]{i,j};
//                 // ans = {i,i+1};
//                 // return ans;
                
//                 // break;
//             }
//         }
           
//     }
//         return null;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}
//     public static void main(String[] args) {
//         System.out.println("Input: ");
//         int[] nums = {2,7,11,15};
//         int target = 9;
//         // System.out.println("Output: "+ twoSum(nums, target));
        
//     }
