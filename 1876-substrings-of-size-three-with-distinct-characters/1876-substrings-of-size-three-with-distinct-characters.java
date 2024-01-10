class Solution {
    public int countGoodSubstrings(String s) {
        char[] arr=s.toCharArray();
        int j=1;
        int k=2;
        int c=0;
        for(int i=0;i<s.length()-2;i++){
            if((arr[i]!=arr[j]) && (arr[j]!=arr[k]) && (arr[i]!=arr[k])){
                c++;
                }
                j++;
                k++;
        }
        return c;
    }
}