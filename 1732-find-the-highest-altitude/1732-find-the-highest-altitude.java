class Solution {
    
   public static int largestAltitude(int[] gain) {
            int[] arr = new int[gain.length + 1];
            arr[0] = 0;
            int temp = 0;
            int max = arr[0];
            for (int i = 0; i < gain.length; i++) {
                temp = temp + gain[i];
                arr[i+1] = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max)
                    max = arr[i];
            }
            return max;
        }
    }