class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:nums){
            ArrayList<Integer> temp = new ArrayList<>();
            while(n>0){
                int rem=n%10;
                 temp.add(rem);
                n/=10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                list.add(temp.get(j));
            }
        }
       int[] arr= new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
}