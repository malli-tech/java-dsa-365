class Solution {
    public String removeOuterParentheses(String s) {
       
        int q=0;
        int r=0;
        String f="";
         String p="";
        while(q<s.length()){
            
            if(s.charAt(q)=='('){
                r++;
                p+=s.charAt(q);
            }
            else{
             r--;
             p+=s.charAt(q);
             if(r==0){
                for(int i=1;i<p.length()-1;i++){
                    f+=p.charAt(i);
                  

                }
                  p="";
             }
            }
            q++;
        }
        return f;
    }
}