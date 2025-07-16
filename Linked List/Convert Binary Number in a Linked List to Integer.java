class Solution {
    public int getDecimalValue(ListNode head) 
    {
      ListNode temp=head;
      int ans=0;
      int count =0;
      while(temp!=null)
      {
         count++;
         temp=temp.next;
      }    
      while(head!=null)
      {
        if(head.val==1)
        {
            ans=ans + (int)Math.pow(2,count-1);
        }
        head=head.next;
        count--;
      }
      return ans;
    }
}
