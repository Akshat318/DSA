import java.lang.*;
class Solution {
    public int maxArea(int[] height) {
     int l = 0;
     int r = height.length -1;
     int a, max=0;

        while(l<r)
        {
          a = Math.min(height[l], height[r]) * (r-l) ;

            max = Math.max(max, a);
          if(height[r]> height[l])
          {
              l++;
          }
            else
              r--;
           
        }
     return max;
    }
}