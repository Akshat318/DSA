import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> a = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0 ; i<=nums.length -3;i++)
    { /*  List<Integer> row = new ArrayList<>();
            
             if(nums[i]==0&&nums[i+1]==0&&nums[i+2]==0)
             {
                row.add(0);
                 row.add(0);
                  row.add(0);
                  a.add(row);
                   i=i+2;
                   continue;
                  
             }*/
        int l = i+1;
        int r = nums.length -1;
        if(i > 0&&nums[i]==nums[i-1] )
{
    continue;
}


        while(l<r){
              List<Integer> row1 = new ArrayList<>();
             
            if(nums[l]+nums[r]+nums[i] == 0)
            {   row1.add(nums[i]);
                row1.add(nums[l]);
                row1.add(nums[r]);
                a.add(row1);
                l++;
                r--;
                while(l<r &&nums[l] == nums[l-1])
                {
                    l++;
                }
                while(l<r && nums[r] ==nums[r+1])
                {
                    r--;
                }
            }
            else if(nums[l]+nums[r] > -nums[i])
            {
                r--;
            }
            else
            {
                l++;
            }
           
        }
    }
    return a;
    }
}