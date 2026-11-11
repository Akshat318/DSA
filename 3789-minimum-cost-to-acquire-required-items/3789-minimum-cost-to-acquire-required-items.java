class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;

        long option1 = n1 * c1 + n2 * c2;

        long common = Math.min(n1, n2);
        long rem1 = n1 - common;
        long rem2 = n2 - common;
        long option2 = common * cb + rem1 * c1 + rem2 * c2;

        long maxNeed = Math.max(n1, n2);
        long option3 = maxNeed * cb;

        return Math.min(option1, Math.min(option2, option3));
    }
}
