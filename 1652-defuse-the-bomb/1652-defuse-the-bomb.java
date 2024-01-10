class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[] =new int[code.length];
        if(k==0) return res;
        if(k>0)
        {
            for(int i=0;i<code.length;i++){
                for(int  j=1;j<=k;j++)
                    res[i]+=code[(i+j)%code.length];
            }
        }
            else
            {
            for(int i=0;i<code.length;i++){
                for(int  j=1;j<=k*-1;j++)
                    res[i]+=code[(code.length+i-j)%code.length];
            }
            }
                return res;
        }
}