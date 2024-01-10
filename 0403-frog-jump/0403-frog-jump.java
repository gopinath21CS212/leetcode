import java.util.HashSet;

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        HashSet<Integer> set = new HashSet<>();

        // Create a set to check if a stone is present
        for (int stone : stones) {
            set.add(stone);
        }

        // dp array to store whether the frog can reach the stone with a certain jump size
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int diff = stones[i] - stones[j];

                // Check if the frog can jump from stone j to stone i
                if (diff <= j + 1) {
                    dp[i][diff] = dp[j][diff - 1] || dp[j][diff] || dp[j][diff + 1];

                    // If we can reach the last stone with any jump size, return true
                    if (i == n - 1 && dp[i][diff]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
