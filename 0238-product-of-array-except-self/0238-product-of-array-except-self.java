class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] f=new int[nums.length];
        int left=1;
        for(int i=0;i<nums.length;i++){
           f[i]=left;
           left*=nums[i];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            f[i]=right*f[i];
            right*=nums[i];
        }
        return f;
    }
}