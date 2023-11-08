class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(Math.abs(fx-sx)<=0 && Math.abs(fy-sy)<=0 && t==1){
            return false;
        }
        if(Math.abs(fx-sx)<=t && Math.abs(fy-sy)<=t){
            return true;
        }else{
            return false;
        }
    }
}