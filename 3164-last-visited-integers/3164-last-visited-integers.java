class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> store=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int k=0;
        boolean flag=true;
        for(int i=0;i<words.size();i++){
            if(words.get(i).equals("prev")){
               flag=false;
               k++;
               if(store.size()>=k){
                   ans.add(store.get(store.size()-k));
               }else{
                   ans.add(-1);
                   flag=false;
               }
            }
            else{
                store.add(Integer.parseInt(words.get(i)));
                if(flag==false){
                    k=0;
                }
            }
        }
        return ans;
        
    }
}