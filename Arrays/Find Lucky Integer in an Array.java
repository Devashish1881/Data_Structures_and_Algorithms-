class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }   
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
             if(entry.getKey()==entry.getValue() && entry.getKey()>ans)
             ans=entry.getKey();
        }
        return ans;
    }
}
