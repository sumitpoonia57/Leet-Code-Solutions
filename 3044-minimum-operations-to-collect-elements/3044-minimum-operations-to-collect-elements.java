class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> s=new HashSet<>();
        int count=0;
        for(int i=nums.size()-1;i>=0;i--){
            if(nums.get(i)<=k){
                s.add(nums.get(i));
            }
                  count++;
            if(s.size()==k){
                break;
            }
        }
        return count;
    }
}