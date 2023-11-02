class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        char ans[]=s.toCharArray();
        for(char x: ans){
            map.put(x,map.getOrDefault(x,0)+1);
        }
       int a=map.get(s.charAt(0));
        for(Character i:map.keySet()){
            if(map.get(i)!=a){
                return false;
            }
        }
        return true;
        
    }
}