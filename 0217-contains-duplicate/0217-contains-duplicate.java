class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> set= new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}