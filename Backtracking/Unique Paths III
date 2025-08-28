class Solution {
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int uniquePathsIII(int[][] grid) 
    {
      int count=1;
      int start_i=0;
      int start_j=0;
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==1)
            {
               start_i=i;
               start_j=j;
            }
            if(grid[i][j]==0)
            {
                count++;
            }
        }
      }    
      int ans=0;
      return find(grid,start_i,start_j,count);
    }
    public int find(int[][] grid, int i,int j, int c)
    {
        int ans=0;
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1)
        {
            return 0;
        }
        if(c==0 && grid[i][j]==2)
        {
           ans=ans+1;
           return ans;
        }
        int temp = grid[i][j];
        grid[i][j] = -1;
        for(int k=0;k<dir.length;k++)
        {
            int new_i=i + dir[k][0];
            int new_j=j + dir[k][1];
            ans=ans+find(grid,new_i,new_j,c-1);
        }
        grid[i][j]=temp;
        return ans ;
    }
}
