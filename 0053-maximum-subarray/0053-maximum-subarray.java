class Solution {
    public int maxSubArray(int[] nums) {
        int l = 0 ; 
        int r = nums.length - 1;
    
        int max = nums[0];
        int sum = 0;
        while(l<=r)
        {   
            sum = sum + nums[l];
           
            
            if(sum>max)
            {
                max = sum;
            } 
           
            
           if(sum<0)
            {
                sum = 0;
            } 
           
           

          /*  if(nums[r]<0)
            {
                r--;
            }*/
            
            l++;
        }
        return max;
    }
}