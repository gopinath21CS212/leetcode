class Solution {
    public int findCenter(int[][] edges) {
        int s=edges[0][0];
        int e=edges[0][1];
        int ns=edges[1][0];
        int ne=edges[1][1];
        int n=0;
        if(s==ns) n=s;
        if(e==ns) n=e;
        if(s==ne)n=s;
        if(e==ne) n=e;
        return n;
    }
}