class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
      reverse(nums,0,nums.length-1);
      reverse(nums, 0,k-1);
      reverse(nums, k, nums.length-1);

    }
    void reverse( int[] p, int left, int right){
        while(left<right){
            int temp= p[left];
            p[left]=p[right];
            p[right]=temp;
            left++;
            right--;
        }
    }
}