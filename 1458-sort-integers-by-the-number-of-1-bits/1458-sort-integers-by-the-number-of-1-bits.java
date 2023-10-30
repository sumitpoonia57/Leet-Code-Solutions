class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        int[][] answer=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int x=Integer.bitCount(arr[i]);
            answer[i][0]=arr[i];
           answer[i][1]=x;
        }
        Arrays.sort(answer,Comparator.comparingInt(o->o[1]));
        for(int j=0;j<answer.length;j++){
            ans[j]=answer[j][0];
        }
        return ans;
    }
}