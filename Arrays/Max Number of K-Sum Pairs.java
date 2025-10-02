class Solution {
    public int maxOperations(int[] nums, int k) 
    {
      int ans=0;
      int low=0;
      int high=nums.length-1;
      Arrays.sort(nums);
      while(low<high)
      {
         int add=nums[low]+nums[high];
         if(add==k)
         {
            low++;
            high--;
            ans++;
         }
         else if(add<k)
         {
            low++;
         }
         else
         {
            high--;
         }
      }   
      return ans; 
    }
}
