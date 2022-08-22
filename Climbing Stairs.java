class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
Memory Usage: 40.9 MB, less than 51.78% of Java online submissions for Climbing Stairs.
*/
