import java.util.HashMap;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int a[] = 
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).mapToInt(Map.Entry::getKey).toArray();
        return a;
    }
}