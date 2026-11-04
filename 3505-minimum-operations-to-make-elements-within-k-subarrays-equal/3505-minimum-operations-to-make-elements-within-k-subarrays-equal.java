import java.util.TreeMap;
import java.util.Arrays;

public class Solution {
    private TreeMap<Integer, Integer> left = new TreeMap<>();
    private TreeMap<Integer, Integer> right = new TreeMap<>();
    private int leftCount = 0;
    private int rightCount = 0;
    private long leftSum = 0;
    private long rightSum = 0;
    private int x;

    public long minOperations(int[] nums, int x, int k) {
        this.x = x;
        int n = nums.length;
        long[] cost = new long[n - x + 1];

        for (int i = 0; i < n; i++) {
            add(nums[i]);
            if (i >= x) {
                remove(nums[i - x]);
            }
            if (i >= x - 1) {
                int median = left.lastKey();
                long currentCost = ((long) leftCount * median - leftSum) + (rightSum - (long) rightCount * median);
                cost[i - x + 1] = currentCost;
            }
        }

        long[][] dp = new long[n + 1][k + 1];
        long INF = Long.MAX_VALUE / 2;
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                if (i >= x) {
                    if (dp[i - x][j - 1] != INF) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - x][j - 1] + cost[i - x]);
                    }
                }
            }
        }

        return dp[n][k];
    }

    private void add(int val) {
        if (left.isEmpty() || val <= left.lastKey()) {
            left.put(val, left.getOrDefault(val, 0) + 1);
            leftSum += val;
            leftCount++;
        } else {
            right.put(val, right.getOrDefault(val, 0) + 1);
            rightSum += val;
            rightCount++;
        }
        balance();
    }

    private void remove(int val) {
        if (left.containsKey(val)) {
            int count = left.get(val);
            if (count == 1) left.remove(val);
            else left.put(val, count - 1);
            leftSum -= val;
            leftCount--;
        } else {
            int count = right.get(val);
            if (count == 1) right.remove(val);
            else right.put(val, count - 1);
            rightSum -= val;
            rightCount--;
        }
        balance();
    }

    private void balance() {
        int targetLeft = (x + 1) / 2;
        while (leftCount > targetLeft) {
            int maxVal = left.lastKey();
            int count = left.get(maxVal);
            if (count == 1) left.remove(maxVal);
            else left.put(maxVal, count - 1);
            leftSum -= maxVal;
            leftCount--;

            right.put(maxVal, right.getOrDefault(maxVal, 0) + 1);
            rightSum += maxVal;
            rightCount++;
        }
        while (leftCount < targetLeft && rightCount > 0) {
            int minVal = right.firstKey();
            int count = right.get(minVal);
            if (count == 1) right.remove(minVal);
            else right.put(minVal, count - 1);
            rightSum -= minVal;
            rightCount--;

            left.put(minVal, left.getOrDefault(minVal, 0) + 1);
            leftSum += minVal;
            leftCount++;
        }
    }
}
