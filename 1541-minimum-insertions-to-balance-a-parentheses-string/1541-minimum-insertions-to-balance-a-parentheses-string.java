class Solution {
    public int minInsertions(String s) {
        int q=0;
        int left=0;
        int count=0;
       while(q<s.length()){
            if(s.charAt(q)=='('){
               left++;
                q++;
            }
            else{
               if(q+1<s.length() && s.charAt(q+1)==')'){
                q+=2;
               }
               else{
                q++;
                count++;
               }
               if(left>0){
                left--;
               }
               else{
                count++;
               }
            }
          
        }
         
 return left*2+count;
    }
}