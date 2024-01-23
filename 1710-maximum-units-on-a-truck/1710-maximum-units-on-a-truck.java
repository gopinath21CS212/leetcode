class Solution {
    public int maximumUnits(int[][] boxtypes, int truckSize) {
        Arrays.sort(boxtypes,new Comparator<int[]>() {
            public int compare(int[] b1,int[] b2){
                return Integer.compare(b2[1],b1[1]);
            }
        });
        int max=0;
        for(int i=0;i<boxtypes.length;i++){
            if(truckSize>=boxtypes[i][0]){
                max+=boxtypes[i][0]*boxtypes[i][1];
                truckSize-=boxtypes[i][0];
            }
            else{
                max+=truckSize*boxtypes[i][1];
                break;
            }
        }
        return max;
    }
}