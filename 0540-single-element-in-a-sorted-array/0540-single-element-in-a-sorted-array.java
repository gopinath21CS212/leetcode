class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int j=0;
       for(int i=1;i<nums.length;i++){
           if(nums[j]!=nums[i] && j+1==i)
               return nums[j];
           else if(nums[j]!=nums[i]){
               j=i;
               if(j==nums.length-1) return nums[i];
           }
           }
        return 0;
    }
}