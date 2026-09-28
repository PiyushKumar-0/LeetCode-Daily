class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int currentdepth=0;
        int maxdepth=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currentdepth+=1;
                maxdepth=Math.max(maxdepth,currentdepth);
            }
            else if(ch==')') {
                currentdepth-=1;
            }
        }
        return maxdepth;
    }
}