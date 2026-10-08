class Solution {
    public int search(int[] nums, int target) {

        // binary search 

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            // this means left part is sorted
            if (nums[mid] >= nums[low]) {
                // see if the target belongs to the left part
                if (nums[low] <= target && target <= nums[mid]) {
                    // this means traget belongs to left part
                    // update high to limit search
                    high = mid - 1;
                }else{
                    low = mid+1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    // this means traget belongs to left part
                    // update high to limit search
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}