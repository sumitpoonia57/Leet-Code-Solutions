class Solution {
    public int maxCoins(int[] piles) {
        int ans=0;
        Arrays.sort(piles);
        int moves=(piles.length)/3;
        int res[]=new int[piles.length];
        int j=0;
        for(int i=piles.length-1;i>=0;i--){
            res[j]=piles[i];
            j++;
        }
      // System.out.println(Arrays.toString(res));
       for(int i=1;i<=moves;i++){
           ans+=res[(2*i)-1];
       }
        return ans;
    }
}