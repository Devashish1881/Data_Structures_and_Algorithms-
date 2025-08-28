class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) 
    {
    int m=board.length;
    int n=board[0].length;
       for(int i=0;i<m;i++)
       {
         for(int j=0;j<n;j++)
         {
            if(board[i][j]==word.charAt(0) && find(board,m,n,i,j,word,0))
           { 
             return true;
           } 
         }
       }   
       return false;
    }
    public boolean find(char[][] board,int m, int n, int i,int j,String word,int index)
    {
        if(index==word.length())
        {
            return true;
        }
         if(i<0 || i>=m || j<0 || j>=n || board[i][j]=='$' ||  board[i][j]!=word.charAt(index))
          {
            return false;
          }
          char temp=board[i][j];
          board[i][j]='$';
          for(int k=0;k<dir.length;k++)
          {
            int new_i= i+ dir[k][0];
            int new_j=j+ dir[k][1];
            if(find(board,m,n,new_i,new_j,word,index+1))
             return true;
          }
          //index=index-1;
          board[i][j]=temp;
          return false;
    }
}
