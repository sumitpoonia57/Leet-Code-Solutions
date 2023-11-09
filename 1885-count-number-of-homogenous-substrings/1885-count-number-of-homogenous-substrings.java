class Solution {
    public int countHomogenous(String s) {
        int ans=0;
        int mod=(int)1e9+7;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if( i==0 ||s.charAt(i)==s.charAt(i-1)){
                curr++;
            }else{
                curr=1;
            }
            ans=(ans+curr)%mod;
        }
     return ans;

    }
}