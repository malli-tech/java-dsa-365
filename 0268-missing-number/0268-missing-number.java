class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
        }
        if(sum!=sum2){
            return sum-sum2;
        }
        else{
            return 0;
        }
    }
}