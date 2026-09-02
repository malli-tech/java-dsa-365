class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
             if(i > 0 && nums[i] == nums[i-1]){
        continue;
         }
             int p=i+1;
        int q=nums.length-1;
        
        while(p<q){
         if(nums[i]+nums[p]+nums[q]==0){
                   List<Integer>r=Arrays.asList(nums[i],nums[p], nums[q]);
                   arr.add(r);
                   p++;
                   q--;
          while(p < q && nums[p] == nums[p-1]){
                        p++;
                    }

                    // Skip duplicate right values
                    while(p < q && nums[q] == nums[q+1]){
                        q--;
                    }
        }
         else if(nums[p]+nums[i]+nums[q]<0){
            p++;
         }
         else{
            q--;
            }
        }
        }
  return arr;
    }
}