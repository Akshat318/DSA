class Solution {
    public int romanToInt(String s) {
       int l = 0;
       int r = s.length()-1;
       int num = 0;
       String a = "";
       while(l<=r)
       {  int n = num;

        if(l+2 <= s.length())
        {
        a = s.substring(l,l+2);
        }
       else
       {
         a = s.substring(l,l+1);
       }

        switch (a)
        {
            
             case "IV":
            num = num + 4;
            break;
             case "IX":
            num = num + 9;
            break;
             case "XL":
            num = num + 40;
            break;
             case "XC":
            num = num + 90;
            break;
             case "CD":
            num = num + 400;
            break;
             case "CM":
            num = num + 900;
            break;
        }
        if(n !=  num)
        {   l = l+2;
           continue;
        }
       
         char c = s.charAt(l);
         switch(c)
         {
             case 'I':
            num = num + 1;
            break;
            case 'V':
            num = num + 5;
            break;
            case 'X':
            num = num + 10;
            break;
            case 'L':
            num = num + 50;
            break;
            case 'C':
            num = num + 100;
            break;
            case 'D':
            num = num + 500;
            break;
            case 'M':
            num = num + 1000;
            break;
         }
       l = l+1;
       } 
       return num;
    }
}