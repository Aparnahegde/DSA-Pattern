https://leetcode.com/problems/matrix-diagonal-sum/description/
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // add primary diagonal
            sum = sum + mat[i][i];

            // add secondary diagonal
            if (i != n - 1 - i) {   
                sum = sum + mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
