class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int element=0;
        int count=0;
        for (int i = 0; i < n; i++) 
        {
               if(count==0)
               {
                count++;
                element=nums[i];
               }
               else if(element==nums[i])
                count++;
               else
                count--; 
        }
         return element;
    }
}
