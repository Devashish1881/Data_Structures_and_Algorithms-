class Solution {
    public int findLHS(int[] nums) 
    {
     int ans=0;
      HashMap<Integer, Integer> hm=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        hm.put(nums[i],hm.getOrDefault(nums[i], 0) + 1);
      }
      for( int i=0;i<nums.length;i++)
      {
        int min=nums[i];
        int max=min+1;
        if (hm.containsKey(max))
        {int temp=hm.get(min) + hm.get(max);
        if(temp > ans)
         ans=temp;
        }
      }
      return ans;
    }
}
