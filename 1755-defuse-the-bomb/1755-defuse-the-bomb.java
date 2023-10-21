class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k==0){
            Arrays.fill(ans,0);
        }
        if(k>0){
            for(int i=0;i<code.length;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                  sum+=code[(i+j)%code.length];
                }
                ans[i]=sum;
            }
        }
        if(k<0){
            int x=(-1)*k;
           for(int i=0;i<code.length;i++){
               int sum=0;
               for(int j=1;j<=x;j++){
                     sum+=code[((i-j)+code.length)%code.length];
               }
               ans[i]=sum;
           }  
             
        }
        return ans;
    }
}