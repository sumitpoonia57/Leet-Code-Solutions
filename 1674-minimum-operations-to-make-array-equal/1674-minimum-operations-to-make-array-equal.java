class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=(2*i)+1;
        }
       int mid=arr[(n/2)];
       int k=n/2;
       int i=0;
       int j=arr.length-1;
       int count=0;
         while(i<j ){
          while(arr[i]!=arr[j]){
               arr[i]=arr[i]+1;
               arr[j]=arr[j]-1;
                   count++;
             }
            i++;
             j--;
           }  
           return count; 
    }
}