class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==2147483647){
            return false;
        }
        int x=(int)Math.sqrt(n);
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        for(int i=0;i<x;i++){
            int ans=(int)Math.pow(4,i);
            if(ans==n){
                return true;
            }
        }
        
         return false;
        
    }
}