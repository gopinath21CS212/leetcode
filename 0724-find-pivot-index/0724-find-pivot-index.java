class Solution {
    public int fun(int s, int e, int[] nums) {
        int sum = 0;
        for (int i = s; i < e; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i=1;i<nums.length;i++){
            s+=nums[i];
        }
        if(s==0) return 0;
        for (int i = 0; i < nums.length; i++) {
            int n1 = fun(0, i, nums);
            int n2 = fun(i + 1, nums.length, nums);

            if (n1 == n2) {
                return i;
            }
        }
        return -1;
    }
}
