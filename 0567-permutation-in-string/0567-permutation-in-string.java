class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        if(m>n){
            return false;
        }   
        int [] s1freq = new int[26];
        int [] s2freq = new int[26];

        for(int i = 0; i < m; i++){
            s1freq[s1.charAt(i) - 'a']++;
        }
        int i=0;
        int j=0;
        while(j<n){
            s2freq[s2.charAt(j) - 'a']++;

            if(j-i+1 > m){
                s2freq[s2.charAt(i) - 'a']--;
                i++;
        }
        
        if(j-i+1 == m && Arrays.equals(s1freq , s2freq)){
            return true;
        }
        j++;
    }
    return false;
}
}