class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l = 1;
      int r = s.length()-1;
      int m = 0;
      int max=0;
      if(s.length()==0)
    {  return 0;}
      while(l<=r)
      {  int c = 0;
         char ch= s.charAt(l);
        for(int i = m ; i<l;i++)
        {
            if(s.charAt(i) != ch  ){
                c++;
            }
            else 
            {   m = i+1;
                break;
            }

        }
        if(c>max)
        {
            max = c;
        }
        l++;
      }
      return max+1;
    }
}