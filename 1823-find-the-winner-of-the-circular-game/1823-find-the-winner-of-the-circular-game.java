class Solution {
    public int fun(int c,List<Integer> l,int k){
        if(l.size()==1) return l.get(0);
        int r=(c+k-1)%l.size();
        l.remove(r);
        int n=r%l.size();
        return fun(n,l,k);
    }
    public int findTheWinner(int n, int k) {
       List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        return fun(0,l,k);
    }
}