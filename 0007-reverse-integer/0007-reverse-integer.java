import java.lang.*;
class Solution {
    public int reverse(int x) {
        long num = 0;
        while(Math.abs(x)>0)
        {
            int d = x%10;
            num = num*10;
            num = num+d;
            x = x/10;
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE )
        {
            return 0;
        }
        }
        return (int)num;
    }
}