class Solution {
    public boolean isAnagram(String s, String t) {
        char[] p= s.toCharArray();
        char [] q= t.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);
        String f= new String(p);
        String g= new String(q);
        if(f.equals(g)){
            return true;
        }
        else{
            return false;
        }
    }
}