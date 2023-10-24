class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        for(int i=1;i<=2;i++){
            if((n*i)%2==0){
                return n*i;
            }
        }
        return ans;
    }
}