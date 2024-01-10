class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        for(int i=0;i<=arr.length-k;i++){
            int s=0;
            for(int j=i;j<k+i;j++){
               s+=arr[j]; 
            }s/=k;
            if(s>=threshold)
                res++;
        }
        return res;
    }
}