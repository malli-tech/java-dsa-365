class Solution {
    public void moveZeroes(int[] nums) {
       int p=0;
       for(int q=0;q<nums.length;q++){
        if(nums[q]!=0){
          int temp=nums[p];
          nums[p]=nums[q];
          nums[q]=temp;
          p++;
        }
       }
    }
}