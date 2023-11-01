class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
       }
       int sum=0;
       for(Integer j:map.keySet()){
          if(map.get(j)==1){
              sum+=j;
          }
       }
       return sum;
        
    }
}