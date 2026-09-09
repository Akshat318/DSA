class Solution {
    public boolean isPalindrome(int x) {int n = 0;
                                         int q = x;
                                        boolean b= false;
                                        if(x<0)
                                        {
                                            b = false;
                                        }
                                        else{
     while(x>0)
{
         int a = x%10;
         n = (n*10) + a;
        
         x = x/10;
 } 
                                        if(n == q) 
                                        { b =true;}
                                        else 
                                        {b = false;}}
                                        return b;
}}
