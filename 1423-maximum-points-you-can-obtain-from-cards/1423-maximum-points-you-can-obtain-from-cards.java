class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int l =0;
     int r = cardPoints.length ;   
     int max = 0;
     int sum = 0;
     int n = 0;
     while(l<r)
     {
        if(n>=k)
        {  
         l--;
          r--;
          sum = sum - cardPoints[l];
          sum = sum + cardPoints[r];
       
         
        }
        else
        { sum = sum + cardPoints[l];
            l++; }
        n++;
        if(max<sum)
        {
             max = sum; 
        }
        if(cardPoints.length - k  == r )
        {
            break;
        }
     }
     return max;
    }
}