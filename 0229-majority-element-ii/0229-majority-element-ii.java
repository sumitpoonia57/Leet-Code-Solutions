class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer j:map.keySet()){
            if(map.get(j)>nums.length/3){
                ans.add(j);
            }
        }
        return ans;
    }
}