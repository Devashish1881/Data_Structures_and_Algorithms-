class Solution {
    public int[] sumZero(int n) 
    {
        int[] arr=new int[n];
      int i=0;   
      int c=1;
      while(i<n)
      {
        if(i%2==0)
        arr[i]=c;
        else
         {
          arr[i]=-c;
          c=c+1;
         }
        i++; 
      }
      if(n%2!=0)
       arr[n-1]=0;
      return arr;
    }
}
