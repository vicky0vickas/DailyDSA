class Solution {
    public boolean isPalindrome(int x) {
        int orgX=x;
        int lastD=0;
        int revx=0;
        while(x>0){
            lastD=x%10;
            revx=(revx*10)+lastD;
            x=x/10;
        }
        if(revx==orgX) return true;
        else return false;
    }
}