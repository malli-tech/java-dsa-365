class Solution {
    public int scoreOfParentheses(String s) {
        int p=0;
        int q=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p++;
            }
            else{
                p--;
                if(s.charAt(i-1)=='('){
                    q+=1<<p;
                }
            }
        }
       
           return q;
        
    }
}