class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int res=0;
        int t=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            if(satisfaction[i]+t >=0){
            t+=satisfaction[i];
            res+=t;
            }
        }
        return res;
    }
}