import java.lang.*;
class Solution {
    
    public double myPow(double x, int n) {
       int N = n;
       if(N<0){
        x = 1/x;
        N = -N;
       }
       return calc(x,N);
       }
    public double calc(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        double h =  calc(x,n/2);
        if(n%2 == 0)
        {
            return h*h;
        }
        else 
        {
            return h*h*x;
        }
    }
        
    }
