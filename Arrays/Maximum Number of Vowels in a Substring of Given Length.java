class Solution {
    public int maxVowels(String s, int k) 
    {
      int ans=Integer.MIN_VALUE;
      int low=0;
      int high=k-1;
      int curr=0;
      for(int i=0;i<k;i++)
      {
         char ch=s.charAt(i);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         {
             curr++;
         }
      }    
      ans=Math.max(curr,ans);
      while(high<s.length()-1)
      {
         char ch1=s.charAt(low);
         if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
         {
             curr--;
         }
         char ch2=s.charAt(high+1);
         if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')
         {
             curr++;
         }
         ans=Math.max(curr,ans);
          low++;
          high++;
      }
      return ans;
    }
}
