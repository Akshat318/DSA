class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = m+n;
        int[] nums3 = new int[m+n];
        
        for(int i =0 ; i< nums1.length ;i++)
            {
                nums3[i] = nums1[i];
            }
        for(int i = nums1.length; i< nums1.length + nums2.length; i++)
            {
                nums3[i] = nums2[i-nums1.length];
            }
        for(int i = 0; i<m+n-1 ; i++)
            {
                for(int j = 0; j<m+n-i-1 ; j++)
                    {
                        if(nums3[j]>nums3[j+1])
                        {
                            int t = nums3[j];
                            nums3[j]= nums3[j+1];
                            nums3[j+1] = t;
                        }
                    }
            }
        if((m+n)%2 == 0)
        {
            int z = l/2;
            return (float)(nums3[z] + nums3[z-1])/2;
        }
        else 
        {
            int z = (int)l/2;
            return (nums3[z]);
        }
    
}}