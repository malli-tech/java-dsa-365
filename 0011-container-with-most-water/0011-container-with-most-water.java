class Solution {
    public int maxArea(int[] height) {
        int q=height.length-1;
        int p=0;
        int area=0;
        while(p<q){
           int h=Math.min(height[p], height[q]);
          area = Math.max(area, (q - p) * h);
           if(height[p]<height[q]){
            p++;
           }
            else{
            q--;
           }
        }
        return area;
        }
}