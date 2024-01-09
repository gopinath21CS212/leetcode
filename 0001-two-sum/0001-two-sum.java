class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
           int n=target-nums[i]; 
            if(map.containsKey(n) && map.get(n)!=i){
                res[0]=i;
                res[1]=map.get(n);
            }
        }
        return res;
    }
}