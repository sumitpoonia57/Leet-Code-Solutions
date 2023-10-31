class Solution {
    public int[] findArray(int[] pref) {
        int[] ans=new int[pref.length];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            int x=pref[i-1]^pref[i];
            ans[i]=x;
        }
        return ans;
        
    }
}