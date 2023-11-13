class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        for(int i=0;i<candidates;i++){
            pq1.add(costs[i]);
        }
        for(int i=Math.max(candidates,costs.length-candidates);i<costs.length;i++){
            pq2.add(costs[i]);
        }
        int head=candidates;
        int tail=costs.length-1-candidates;
        long ans=0;
        for(int i=0;i<k;i++){
        if(pq2.isEmpty()|| !pq1.isEmpty() && pq1.peek()<=pq2.peek()){
            ans+=pq1.poll();
            if(head<=tail){
                pq1.add(costs[head]);
                head++;
              }
            }
            else{
                ans+=pq2.poll();
                if(head<=tail){
                    pq2.add(costs[tail]);
                    tail--;
                }
            }
        }
        return ans;
    }
}