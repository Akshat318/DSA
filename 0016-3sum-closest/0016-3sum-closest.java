import java.lang.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    

    int m= nums[0]+nums[1]+nums[2];
    int l = Math.abs(m-target);
for(int i =0;i<nums.length-2;i++)
{
  for(int j = i+1;j<nums.length-1;j++)
      {
        for(int k = j+1;k<nums.length;k++)
{
int a = nums[i]+nums[j]+nums[k];
int d = Math.abs(a-target);
if(d<l)
{
    l= d;
    m= a;
    
}

 }
      }
}
        return m;
    }
}