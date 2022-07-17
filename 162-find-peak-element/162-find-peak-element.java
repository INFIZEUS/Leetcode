class Solution {
    public int findPeakElement(int[] arr) {
         int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in des part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                //you are is asc part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find the max element in the above 2 checks
        // hence, when thehy are pointing to just one element, that is the max one because that is what the check say
        // mroe elaboration: at every point of time for start and end they have the best possible answer till that time.
        // and if we are saying that only one item is remaining, hence cuz of above line that is the est possible answer.

        return start; // or return end as they both are equal.
}
}