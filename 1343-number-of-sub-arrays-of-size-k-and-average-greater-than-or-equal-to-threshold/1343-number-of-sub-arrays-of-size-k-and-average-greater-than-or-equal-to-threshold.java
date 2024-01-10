class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        int s=0;
        for(int i=0;i<k;i++)
           s+=arr[i];
        if(s/k>=threshold) res++;
        for(int i=k;i<arr.length;i++){
            s+=arr[i];
            s-=arr[i-k];
            if(s/k>=threshold) res++;
        }
        return res;
    }
}