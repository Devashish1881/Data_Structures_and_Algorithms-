class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int ans=numBottles;
        int quotient=0;
        while(numBottles>=numExchange)
        {
            quotient=(int)numBottles/numExchange;
            ans=ans+quotient;
            numBottles=quotient+numBottles%numExchange;

        }   
        return ans;
    }
}
