class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
       int num1 = 0 , num2 = 0;
       int c1 = 0 , c2= 0;
        for(int i = 0 ; i < nums.length; i++)
        {    
            if(c1>0 && num1 == nums[i])
            {
                c1++;
            }
            else if(c2>0 && num2 == nums[i])
            {
                c2++;
            }
            else if(c1 == 0)
            {
                num1 = nums[i];
                c1++;
            }
            else if(c2 == 0)
            {
                num2 = nums[i];
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        int n = 0 , m =0;
        for(int num : nums){
            if(num1 == num)
            {
               m++;
            }
            if(num2 == num)
            {
                n++;
            }
        }
        List<Integer> l = new ArrayList<>();
        if(num1==num2)
        {
            l.add(num1);
        }
        else{
        if(m>(nums.length/3))
        {
            l.add(num1);
        }
        if(n>(nums.length/3))
        {
            l.add(num2);
        }}
        return l;
    }
}