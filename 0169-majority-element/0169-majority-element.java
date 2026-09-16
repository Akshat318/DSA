import java.util.*;
class Solution {
    public int majorityElement(int[] nums) { int r=0;
        HashMap<Integer ,Integer> a = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++)
        {
            if(a.containsKey(nums[i])){
                int v = a.get(nums[i]);
                a.put(nums[i], v+1);
            }
            else{
                a.put(nums[i],1);
            }
        }
        for( Map.Entry<Integer,Integer> v: a.entrySet())
        {
            if(v.getValue()>(nums.length/2))
            r=  v.getKey();
        }
        return r;
    }
}