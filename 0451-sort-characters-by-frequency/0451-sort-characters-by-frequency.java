class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // Using list to sort map
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((x,y)->map.get(y)-map.get(x));
      //  System.out.println(list);
      for(char x:list){
      for(int i=0;i<map.get(x);i++){
          sb.append(x);
         }
      }
        return sb.toString();
    }
}