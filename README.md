class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

       for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0078-subsets](https://github.com/Akshat318/DSA/tree/master/0078-subsets) |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
| [1385-find-the-distance-value-between-two-arrays](https://github.com/Akshat318/DSA/tree/master/1385-find-the-distance-value-between-two-arrays) |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
| [3693-climbing-stairs-ii](https://github.com/Akshat318/DSA/tree/master/3693-climbing-stairs-ii) |
## Hash Table
|  |
| ------- |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
## Math
|  |
| ------- |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
| [1922-count-good-numbers](https://github.com/Akshat318/DSA/tree/master/1922-count-good-numbers) |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
| [3789-minimum-cost-to-acquire-required-items](https://github.com/Akshat318/DSA/tree/master/3789-minimum-cost-to-acquire-required-items) |
## Dynamic Programming
|  |
| ------- |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
| [3693-climbing-stairs-ii](https://github.com/Akshat318/DSA/tree/master/3693-climbing-stairs-ii) |
## Sliding Window
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
## Heap (Priority Queue)
|  |
| ------- |
| [3505-minimum-operations-to-make-elements-within-k-subarrays-equal](https://github.com/Akshat318/DSA/tree/master/3505-minimum-operations-to-make-elements-within-k-subarrays-equal) |
## Two Pointers
|  |
| ------- |
| [1385-find-the-distance-value-between-two-arrays](https://github.com/Akshat318/DSA/tree/master/1385-find-the-distance-value-between-two-arrays) |
## Binary Search
|  |
| ------- |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
| [1385-find-the-distance-value-between-two-arrays](https://github.com/Akshat318/DSA/tree/master/1385-find-the-distance-value-between-two-arrays) |
## Sorting
|  |
| ------- |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
| [1385-find-the-distance-value-between-two-arrays](https://github.com/Akshat318/DSA/tree/master/1385-find-the-distance-value-between-two-arrays) |
## Backtracking
|  |
| ------- |
| [0078-subsets](https://github.com/Akshat318/DSA/tree/master/0078-subsets) |
## Bit Manipulation
|  |
| ------- |
| [0078-subsets](https://github.com/Akshat318/DSA/tree/master/0078-subsets) |
| [0268-missing-number](https://github.com/Akshat318/DSA/tree/master/0268-missing-number) |
## Greedy
|  |
| ------- |
| [3789-minimum-cost-to-acquire-required-items](https://github.com/Akshat318/DSA/tree/master/3789-minimum-cost-to-acquire-required-items) |
## Recursion
|  |
| ------- |
| [1922-count-good-numbers](https://github.com/Akshat318/DSA/tree/master/1922-count-good-numbers) |
## Stack
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
## Segment Tree
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
## Queue
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
## Monotonic Stack
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
## Monotonic Queue
|  |
| ------- |
| [3420-count-non-decreasing-subarrays-after-k-operations](https://github.com/Akshat318/DSA/tree/master/3420-count-non-decreasing-subarrays-after-k-operations) |
<!---LeetCode Topics End-->