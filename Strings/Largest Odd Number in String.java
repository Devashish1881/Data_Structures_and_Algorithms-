class Solution {
    public String largestOddNumber(String num) 
    {
      int i=num.length()-1;
      int flag=0;
      while(i>=0)
      {
         char digit=num.charAt(i);
            if(digit=='1' || digit=='3' || digit=='5' || digit=='7' || digit=='9')
            {
                flag=1;
                break;
            }
           i--; 
      }
      if(flag==0)
      {
         return "";
      }
      return num.substring(0,i+1);
    }
}
