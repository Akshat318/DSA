class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int e = 0;
    for(int i = 0 ; i< nums1.length ; i++)
    { int c = -1;
    int d = -1;
        for(int j = 0 ; j < nums2.length ; j++)
        {
            if(nums1[i] == nums2[j])
            {
                c = 1;
                
            }
            if (c== 1 )
            {
                if(nums2[j] > nums1[i])
             { d = nums2[j];
                ans[e] = d;
                e++;
                break;
             }
            }
        }
        if(c == -1 ||(c==1 && d == -1) )
        {
            ans[e] = -1;
            e++;
        }
       
    }    
    return ans;
    }
}