class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            list.add(map.get(key));
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
           if(list.get(i)==list.get(i+1)){
               return false;
           }
        }
        return true;
    }
}