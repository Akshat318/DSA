class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int a[] =new int[2];
        int p = 0;
        int x = 0,y=0;
        for(int i = 1 ; i <=n*n ; i++ )
        {   int c = 0 ;
            for(int j = 0 ; j <n ; j++)
            {
                for(int k =0 ; k < n; k++)
                {
                    if(grid[j][k] == i)
                    {
                       c++;
                    }
                }
            }
            if(c == 2)
            {
               x = i;
            }
            if(c == 0)
            {
                y = i;
            }
        }
        a[0] = x;
        a[1] = y;
        return a;
    }
}