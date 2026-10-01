import java.lang.*;
class Solution {
    public boolean isValid(String s) {
    
    if(s.length() < 60)
     
   {  double c =1;
     
     long d = 0;
    for(int i =0;i<s.length() ; i++)
     {
       int ch = s.charAt(i);
       if(ch == '(')
       {
       c= (c*10)+1;
      
       d = d+1;
       }
       else if(ch == '{')
       {
       c =(c*10)+2;
      
       d = d+2;
       }
       else if(ch == '[')
       {
        c = (c*10)+3;
       
        d = d+3;
       }
       else if(ch == ')')
       {
        c = (c-1)/10;
       
        d = d-1;
       }
       else if(ch == '}')
       {
       c= (c-2)/10;
      
       d = d-2;
       }
       else if(ch == ']')
       {
         c = (c-3)/10;
         
          d= d-3;
       }
       else
       {}
       if(d<0)
       {
        return false;
       }
        
     }
     if(c==1)
     {
        return true;
     }  
     else 
     {
        return false;
     } }
     else
     {  int d =0;
        for(int i = 0; i<s.length() ; i++)
        {
            int ch = s.charAt(i);
       if(ch == '(')
       {
      
      
       d = d+1;
       }
       else if(ch == '{')
       {
       
      
       d = d+2;
       }
       else if(ch == '[')
       {
        
       
        d = d+3;
       }
       else if(ch == ')')
       {
        
       
        d = d-1;
       }
       else if(ch == '}')
       {
       
      
       d = d-2;
       }
       else if(ch == ']')
       {
         
         
          d= d-3;
       } 
        }
        if(d == 0)
        {
            return true;
        }
        else
        return false;
     }
     
    }
}