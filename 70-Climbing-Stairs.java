class Solution {
    public int climbStairs(int n) {
        //Base Case
        if (n <= 2) return n;
        
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int current = 0;
        //Recursive Step
        for (int i = 3; i <= n; i++) {
            current = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }

        return current;
    }
}
