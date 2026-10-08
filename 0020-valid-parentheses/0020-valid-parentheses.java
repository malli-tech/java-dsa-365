class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack= new Stack<>();
        if(s.length()==1){
            return false;
        }
         for(int i=0;i<s.length();i++){
               char p=s.charAt(i);
               if(p=='('||p=='{'||p=='['){
                stack.push(p);
               }
               else{
                if(stack.isEmpty()){
                    return false;
                }
              char  q=stack.pop();
                if(q=='('&&p!=')'){
                    return false;
                }
                if(q=='{'&&p!='}'){
                    return false;
                }
                if(q=='['&&p!=']'){
                    return false;
                }
               }
         }
         if(stack.size()!=0){
            return false;
         }
         return true;
    }
}