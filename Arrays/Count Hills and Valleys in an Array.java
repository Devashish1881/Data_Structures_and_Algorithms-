class Solution {
    public int countHillValley(int[] nums) 
    {
      int answer=0;
      for(int i=1;i<nums.length-1;i++)
      {
        if(nums[i]==nums[i-1])
        {
            ;
        }
        else if(nums[i]==nums[i+1])
        {
            int j=i;
            while(nums[i]==nums[j] && j<nums.length-1)
            {
                j++;
            }
            if((nums[i]>nums[i-1] && nums[i]> nums[j]) || (nums[i]<nums[i-1] && nums[i]<nums[j]))
            {
                answer++;
            }
        }
        else if((nums[i]>nums[i-1] && nums[i]> nums[i+1]) || (nums[i]<nums[i-1] && nums[i]<nums[i+1]))
         {
            answer++;
         }
      }
      return answer;
    }
}
