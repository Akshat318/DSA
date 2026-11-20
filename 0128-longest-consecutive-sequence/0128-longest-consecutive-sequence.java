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
        int c = 0;
        if(set.contains(i-1))
        { continue;
        }
            while(i+nums.length - 1 >= j)
            {  
                if(set.contains(j))
                {
                 c++;
                }
                else
               {
                break;
               }
               j++;
            }
            if(c>m)
            {
                m = c;
            }
        }
          return m;
    }
}