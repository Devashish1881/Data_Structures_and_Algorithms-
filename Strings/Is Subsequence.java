class Solution {
    public boolean isSubsequence(String s, String t) 
    {
      int l=s.length();
      int i=0;
      int j=0;
      while(i<l && j<t.length())
      {
         char sub=s.charAt(i);
         char ch=t.charAt(j);
         if(ch==sub)
        {
            i++;
        }
        j++;
      }    
      if(i==l)
      {
        return true;
      }
      return false;
    }
}
