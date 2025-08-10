class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // Flip the submatrix vertically by reversing the order of rows within the submatrix
        for (int i = 0; i < k / 2; i++) {
            int topRow = x + i;
            int bottomRow = x + k - 1 - i;
            for (int col = y; col < y + k; col++) {
                int temp = grid[topRow][col];
                grid[topRow][col] = grid[bottomRow][col];
                grid[bottomRow][col] = temp;
            }
        }
        return grid;
    }
}
