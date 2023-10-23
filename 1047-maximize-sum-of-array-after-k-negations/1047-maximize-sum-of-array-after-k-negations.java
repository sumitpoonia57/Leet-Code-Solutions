class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
       Arrays.sort(nums);
       int count=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
           if(count<k && nums[i]<0){
               nums[i]=(-1)*nums[i];
               count++;
           }
       }
      
       if(count<k){
            Arrays.sort(nums);
            while(count<k){
           nums[0]=(-1)*nums[0];
           count++;
            }
       }

       for(int x:nums){
           sum+=x;
       }
       return sum;
    }
}