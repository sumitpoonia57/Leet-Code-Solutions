class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        for(int i=0;i<=15;i++){
            int ans=(int)Math.pow(4,i);
            if(ans==n){
                return true;
            }
        }
        
         return false;
        
    }
}