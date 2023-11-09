class Solution {
    public int[] frequencySort(int[] nums) {
        int ans[]=new int[nums.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        int arr[][]=new int[map.size()][2];
        int j=0;
        for(int key:map.keySet()){
            arr[j][0]=key;
            arr[j][1]=map.get(key);
            j++;
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
         Arrays.sort(arr,Comparator.comparingInt(o->o[1]));
        System.out.println(Arrays.deepToString(arr));
           int k=0;
         for( int i=0;i<arr.length;i++){
        int count = 0;
        while(count<arr[i][1]){
            ans[k] = arr[i][0];
            k++;
            count++;
        }
    }

        return ans;       
    }
}