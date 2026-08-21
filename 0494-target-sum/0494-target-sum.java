public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;

        // Edge case: if target is out of achievable range
        if (Math.abs(target) > sum) return 0;

        // (target + sum) must be even for a valid partition
        if ((target + sum) % 2 != 0) return 0;

        int newTarget = (target + sum) / 2;

        // dp[j] = number of ways to reach sum j
        int[] dp = new int[newTarget + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = newTarget; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[newTarget];
    }
}