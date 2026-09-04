class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length - 1);
    }
    int binary(int[] nums, int t, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
      
        if (nums[mid] == t) {
            return mid;
        }
     if(nums[low]<=nums[mid]){
         if (nums[low]<=t && t<nums[mid] ) {
            return binary(nums, t,low, mid-1);
        }
          return binary(nums, t, mid + 1, high);
     }
        else {
              if (nums[mid] < t && t <= nums[high]) {
            return binary(nums, t, mid+1, high);
              }
                return binary(nums, t, low, mid - 1);
        }
    }
}