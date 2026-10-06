class Solution {
    public int minAddToMakeValid(String s) {
        int p=0;
        int q=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
            p++;
           }
           else{
            if(p>0){
            p--;
           }
           else{
            q++;
           }
           }
        }
        return p+q;
    }
}