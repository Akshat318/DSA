class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean isPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        
        int a = dividend > 0 ? -dividend : dividend;
        int b = divisor > 0 ? -divisor : divisor;
        
        int quotient = 0;
        
        while (a <= b) {
            int tempDivisor = b;
            int multiple = 1;
            
            while (tempDivisor >= (Integer.MIN_VALUE >> 1) && a <= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            quotient += multiple;
            a -= tempDivisor;
        }
        
        return isPositive ? quotient : -quotient;
    }
}
