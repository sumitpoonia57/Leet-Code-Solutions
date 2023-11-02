class Solution {
    public int heightChecker(int[] heights) {
        int temp[]=new int[heights.length];
        int i=0;
        for(int x:heights){
            temp[i]=x;
            i++;
        }
        Arrays.sort(temp);
        int count=0;
        for(int j=0;j<heights.length;j++){
            if(temp[j]!=heights[j]){
                count++;
            }
        }
        return count;
        
    }
}