class Solution {
    public int findKOr(int[] nums, int k) {
        int sum=0;
        if(k==1){
            for(int i=0;i<nums.length;i++){
              sum=sum|nums[i];
            }
            return sum;
        }
        if(k==nums.length){
            sum = nums[0];
            for(int i=1;i<nums.length;i++){
              sum&=nums[i];
            }
            return sum;
        }
        int x=0;
        int count=0;
        for(int i=0;i<32;i++){
            for(int j=0;j<nums.length;j++){
                 x=(int)Math.pow(2,i);
               int y= x& nums[j];
              if(y==x){
                  count++;
              }
            }
            if(count>=k){
                sum|=x;
            }
            count=0;
        }
        return sum;
        
    }
}