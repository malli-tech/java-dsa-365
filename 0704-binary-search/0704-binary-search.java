class Solution {
    public int search(int[] nums, int target) {
        return binary( nums, target,0, nums.length-1);
    }
    int binary( int[] nums, int t, int low, int high){
        if(low> high){
            return -1;
        }
        int mid=(low+high)/2;
            if( nums[mid]==t){
                return mid;
            }
            else if( nums[mid]<t){
                return binary( nums, t,mid+1, high);
            }
            else{
                 return binary( nums, t,low, mid-1);
            }
    }

}