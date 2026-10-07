class Solution {
    public double myPow(double x, int n) {
        double q=x;
        if(n==0){
            return 1;
        }
            q=Math.pow(x,n);
            return q;
    }
}