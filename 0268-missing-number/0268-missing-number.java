class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int f=-1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                f=i;
            break;
            }
        }
        if(f!=-1)
        return f;
        return nums.length;
    }
}