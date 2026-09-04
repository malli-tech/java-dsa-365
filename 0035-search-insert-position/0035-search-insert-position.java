class Solution {
    public int searchInsert(int[] nums, int target) {
        return b( nums, target, 0, nums.length-1);
    }
    int b( int[] nums, int t, int low, int high){
        if(low>high){
            return low;
        }
        int mid=(low+high)/2;
        if(nums[mid]==t){
            return mid;
        }
        else if( nums[mid]<t){
            return b(nums, t, mid+1, high);
        }
        else{
             return b(nums, t, low, mid-1);
        }
    }
}