class Solution {
    public boolean isPalindrome(String s) {
        int p=s.length()-1;
        int q=0;
        while(q<p){
            while(q<p && !Character.isLetterOrDigit(s.charAt(p))){
                p--;
            }
             while(q<p && !Character.isLetterOrDigit(s.charAt(q))){
                q++;
            }
            if(Character.toLowerCase(s.charAt(p))!=Character.toLowerCase(s.charAt(q))){
                return false;
            }
            p--;
            q++;
        }
        return true;
    }
}