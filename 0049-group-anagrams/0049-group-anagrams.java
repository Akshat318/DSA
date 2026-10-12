import java.util.*;

class Solution {
 
    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;  
            count[b.charAt(i) - 'a']--;   
        }

        for (int c : count) {
            if (c != 0) {
                return false;           
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            boolean placed = false;

           
            for (String key : map.keySet()) {
                if (isAnagram(word, key)) {
                    map.get(key).add(word);  
                    placed = true;
                    break;
                }
            }

           
            if (!placed) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                map.put(word, newGroup);     
            }
        }

        
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(s.groupAnagrams(strs));
       
    }
}
