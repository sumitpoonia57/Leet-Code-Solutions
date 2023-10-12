class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start<=end){
            if(nums[start]==target){
                count++;
                if(ans[0]==-1){
                ans[0]=start;
                }
            }
            start++;
        }
        if(count>0){
        int val=ans[0];
        ans[1]=val+(count-1);
        }
        return ans;
        
    }
}