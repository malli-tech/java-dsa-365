class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0;
        int q=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[p]!=nums[q]){
                p++;
               nums[p]=nums[q];
            }
            q++;
        }
        return p+1;
    }

}