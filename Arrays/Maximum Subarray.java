class Solution {
    public int maxSubArray(int[] nums) 
    {
      int maxans= Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<nums.length;i++)
      {
         sum+=nums[i];
         if(sum>maxans)
         {
             maxans=sum;
         }
         if(sum<0)
         {
            sum=0;
         }
      }   
      return maxans;   
    }
}
