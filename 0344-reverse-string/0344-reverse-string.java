class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int p=0;
        while(p<n){
            char q=s[n];
            s[n]=s[p];
            s[p]=q;
            n--;
            p++;
        }
    }
}