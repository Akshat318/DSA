class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min = prices[0];
        int max = 0;
        
        for(int i = 0 ; i < prices.length ; i++)
        {
           if(min > prices[i] )
           {
            min =prices[i];
            max = min;
            
            continue;
           }

        
       
        if(max < prices[i] )
        {
            max = prices[i];

        }
       
        if(diff < (max-min))
        {
           diff = max-min; 
        }
           
         }
        return diff;
    }
}