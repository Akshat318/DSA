class Solution {
    public int subarraySum(int[] nums, int k) {
      Map<Integer, Integer> seen = new HashMap<>();
seen.put(0, 1);                 
int current = 0, count = 0;

for (int x : nums) {
    current += x;                                     
    count += seen.getOrDefault(current - k, 0);        
    seen.put(current, seen.getOrDefault(current, 0) + 1);  
}
return count;
} }