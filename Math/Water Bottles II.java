class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) 
    {
       int ans=numBottles;
       while(numBottles>0 && numBottles>=numExchange)
       {
          numBottles=numBottles-numExchange +1;
          ans=ans+1;
          numExchange++;
       }    
       return ans;
    }
}
