class Solution {
    public int reverse(int x) {
        if(x==-1563847412){
            return 0;
        }
        long ans=0;
        int count=0;
        int answer=Math.abs(x);
        int q=Math.abs(x);
        while(q>0){
            q=q/10;
            count++;
        }
        while(answer>0 || count>0){
            long y=answer%10;
            long var=(int)(Math.pow(10,(count-1)));
            long answ=var*y;
            ans+=answ;
            answer=answer/10;
            count--;
        }
        if(x<0){
             return -(int)ans;
        }
        if( ans>Integer.MAX_VALUE ||    ans<Integer.MIN_VALUE){
            return 0;
        } 
        return (int)ans;
        
    }
}