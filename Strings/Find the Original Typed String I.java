class Solution {
    public int possibleStringCount(String word) 
    {
       int ans=1;
       int l=0;int r=1;
       while(r<word.length())
       {
            if(word.charAt(l)==word.charAt(r))
            {
                ans=ans+1;
                r++;
            }
            else
            {
                l=r;
                r++;
            }
       }
       return ans;
    }
}
