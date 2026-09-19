class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int f=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    f=1;
                }
            }
            if(f==0){
                return i;
            }
        }
        return 0;
    }
}