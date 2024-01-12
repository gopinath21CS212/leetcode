class Solution {
    public void fun(int[][] g,int node,List<List<Integer>> res,List<Integer> l){
        if(node==g.length-1)
        {
            res.add(new ArrayList<Integer>(l));
            return;
        }
        for(int n:g[node]){
            l.add(n);
             fun(g,n,res,l);
             l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(0);
        fun(graph,0,res,list);
        return res;
    }
}