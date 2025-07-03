class Solution {
    public char kthCharacter(int k)
    {
       if(k==1) 
       {
         return 'a';
       }
      String word="ab";
      while(word.length()<k)
      {
        String temp="";
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch=='z')
            {
                ch='a';
            }
            ch=(char)(ch +1);
            temp=temp+ch;
        }
        word =word+temp;
      }    
      return word.charAt(k-1); 
    }
}
