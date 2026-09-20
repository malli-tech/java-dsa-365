class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
       List<Map.Entry<Integer, Integer>>list=new ArrayList<>(map.entrySet());
       list.sort((a,b) -> b.getValue()-a.getValue());
       int[] arr= new int[k];
       int i=0;
       for(Map.Entry<Integer,Integer>entry:list){
            arr[i]=entry.getKey();
            i++;
            if(i==k){
                break;
            }
       }
        return arr;
    }
}