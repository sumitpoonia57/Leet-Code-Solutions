class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        int ans=(int)(Math.log(n)/Math.log(2));
        int result=(int)(Math.pow(2,ans));
        if(result==n){
        return true;
        }
        return false;
    }
}