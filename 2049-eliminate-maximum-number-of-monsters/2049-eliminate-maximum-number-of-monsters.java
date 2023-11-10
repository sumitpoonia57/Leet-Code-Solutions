class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double time[]=new double[dist.length];
        int ans=0;
        for(int i=0;i<dist.length;i++){
            time[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(time);
        System.out.println(Arrays.toString(time));
       for(int i=0;i<time.length;i++){
           if(time[i]<=i){
               break;
           }
           ans++;
       }
        return ans;
    }
}