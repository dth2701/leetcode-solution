class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        //If the obstacle is at the top-left corner
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int [][] dp = new int[m][n];
        dp[0][0] = 1; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //if meeting the obstacle
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                //Checks if the cell above the current one is not an obstacle.
                if (i - 1 >= 0 && obstacleGrid[i - 1][j] == 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                //Checks if the cell on the left of the current one is not an obstacle.
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
