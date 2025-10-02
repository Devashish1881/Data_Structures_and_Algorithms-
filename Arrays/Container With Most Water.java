class Solution {
    public int maxArea(int[] height) 
    {
       int ans=0;
       int i=0;
       int j=height.length-1;
       while(i<j)
       {
          int l=Math.min(height[i],height[j]);
          int area=l*(j-i);
          ans=Math.max(ans,area);
          if(height[i]<=height[j])
          {
            i++;
          }
          else
          {
             j--;
          }
       }   
       return ans; 
    }
}
