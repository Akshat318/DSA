import java.util.HashSet;
import java.util.List;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalSumOfSquares = 0;
        int n = nums.size();
        
        // Iterate through each possible starting index of the subarray
        for (int i = 0; i < n; i++) {
            HashSet<Integer> distinctElements = new HashSet<>();
            
            // Expand the subarray to the right from the starting index i
            for (int j = i; j < n; j++) {
                distinctElements.add(nums.get(j));
                
                // Get the count of distinct elements in the current subarray nums[i...j]
                int distinctCount = distinctElements.size();
                
                // Add the square of the distinct count to the total sum
                totalSumOfSquares += distinctCount * distinctCount;
            }
        }
        
        return totalSumOfSquares;
    }
}
