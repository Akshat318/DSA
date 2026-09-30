class Solution {
    public int strStr(String haystack, String needle) {
      int l = 0;
      int r = haystack.length()-1;
      int re = -1;
     
      while(l<=haystack.length()-needle.length())
      {int c =0;
         for(int i =0;i<needle.length();i++)
         {
            if(needle.charAt(i)==haystack.charAt(i+l))
            {
                c++;
            }
         }

         if(c == needle.length())

        {
            re = l;
            break;
        }
        c = 0;
        l++;
      }
        return re;
    }
}