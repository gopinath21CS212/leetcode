class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        boolean f=true;
        for(int i=0;i<arr.length-1;i++){
            String s1=arr[i];
            String s2=arr[i+1];
            if(s1.charAt(s1.length()-1)!=s2.charAt(0))
                f=false;
        }
        String s1=arr[arr.length-1];
        String s2=arr[0];
         if(s1.charAt(s1.length()-1)!=s2.charAt(0))
                f=false;
        return f;
    }
}