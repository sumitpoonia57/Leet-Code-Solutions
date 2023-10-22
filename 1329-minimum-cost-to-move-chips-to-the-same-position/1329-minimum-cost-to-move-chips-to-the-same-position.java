class Solution {
    public int minCostToMoveChips(int[] position) {
        int count=0;
        int count1=0;
        for(int i:position){
            if(i%2==0){
                count++;
            }else{
                count1++;
            }
        }
        if(count1>count){
            return count;
        }else if(count>count1){
            return count1;
        }else{
           return  count;
        }
        
    }
}