class Solution {
    public int minOperations(int[] nums) {
        if(nums.length<2){
            return -1;
        }
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        int count= 0;
        for(int i=0;i<list.size();i++){
             int x=list.get(i);
             if(x<2){
                 return -1;
             }
            while(x>0){
                if(x%3==0){
                    x=x-3;
                    count++;
                } else if(x%2==0){
                    x=x-2;
                    count++;
                }
                else{
                    x=x-3;
                    count++;
                }
            }
        }
        return count;   
    }
}