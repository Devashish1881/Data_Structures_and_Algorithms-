class Solution {
    public int findMin(int[] nums) 
    {
         int low=0;
         int high=nums.length-1;
         int mid=0;
         int ans=Integer.MAX_VALUE;
         while(low<=high)
        {
            mid=low+(high-low)/2;
            ans=Math.min(nums[mid],ans);
            if(nums[mid]>nums[high])
            {
                 low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }  
        return ans;
    }
}
