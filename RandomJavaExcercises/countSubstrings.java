class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for (int i=0; i<=s.length()-1; i++)
            for(int k=s.length()-1; k>0;k--){
                if(k!=i)
                if(s.charAt(i)==s.charAt(k))
                    cnt++;
                if(s.charAt(i)==s.charAt(k) && s.charAt(i)==s.charAt(k-1))
                    cnt++;
            }
    return cnt+s.length();}
}