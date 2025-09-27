class Solution {
    public String largestGoodInteger(String num) 
    {
        int flag=1;
      int max=Integer.MIN_VALUE;
      int i=0;
      int j=2;
      while(j<num.length())
      {
         char ch=num.charAt(i);
         if(ch==num.charAt(i+1) && ch==num.charAt(i+2))
         {
            flag=0;
            max=Math.max(max,Integer.parseInt(num.substring(i,j+1)));
            i=j+1;
            j=j+3;
         }
         else
         {
            i=i+1;
            j=j+1;
         }
      }   
      if(flag==1)
       return "";
      if(max==0)
       return "000"; 
      return Integer.toString(max); 
    }
}
