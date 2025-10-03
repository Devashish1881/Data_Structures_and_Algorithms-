class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
          int low=0;
          int high=k-1;
          double ans=Integer.MIN_VALUE;
          double avg=0;
          double add=0;
          for(int i=0;i<k;i++)
          {
            add=add+nums[i];
          }
          avg=add/k;
          ans=Math.max(avg,ans);
          while(high<nums.length-1)
          {
              add=add-nums[low]+nums[high+1];
              avg=add/k;
              ans= Math.max(avg,ans);
              low++;
              high++;
          }
          return ans;
    }
}
