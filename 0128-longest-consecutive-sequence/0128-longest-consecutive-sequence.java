import java.lang.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        int m = 0;
        for(int i : set)
        {  int j = i;
        
        if(set.contains(i-1))
        { continue;
        }
            while(set.contains(j+1))
            {  
               j++;
            }
           m = Math.max(j - i + 1 , m);
        }
          return m;
    }
}