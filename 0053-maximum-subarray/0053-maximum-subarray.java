class Solution {
    public int maxSubArray(int[] nums) {
       int low=0;
       int high=nums.length-1;
       return maxsubarray(nums, low, high);
    }
    public int maxsubarray(int[] nums, int low, int high){
        if(low==high){
            return nums[low];
        }
        int mid=(low+high)/2;
        int leftmax=maxsubarray(nums, low, mid);
        int rightmax=maxsubarray(nums, mid+1, high);
        int crosssum=maxcrosssubarray(nums, low, mid, high);
        return Math.max(Math.max(leftmax, rightmax), crosssum);
    }
    public int maxcrosssubarray(int[] nums, int low, int mid, int high){
        int leftsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=low;i--){
          sum+=nums[i];
          if(sum>leftsum){
            leftsum=sum;
          }
        }
          int rightsum=Integer.MIN_VALUE;
        int sum2=0;
        for(int i=mid+1;i<=high;i++){
          sum2+=nums[i];
          if(sum2>rightsum){
            rightsum=sum2;
          }
        }
     return leftsum+rightsum;
    }
}