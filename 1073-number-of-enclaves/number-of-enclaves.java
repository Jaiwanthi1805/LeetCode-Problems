class Solution {

    public int numEnclaves(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        for (int j = 0; j < cols; j++) {

            if (grid[0][j] == 1) {
                dfs(grid, 0, j);
            }

            if (grid[rows - 1][j] == 1) {
                dfs(grid, rows - 1, j);
            }
        }
        for (int i = 0; i < rows; i++) {

            if (grid[i][0] == 1) {
                dfs(grid, i, 0);
            }

            if (grid[i][cols - 1] == 1) {
                dfs(grid, i, cols - 1);
            }
        }
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int row, int col) {

        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length ||
            grid[row][col] == 0) {
            return;
        }
        grid[row][col] = 0;

        dfs(grid, row - 1, col);

        dfs(grid, row + 1, col);

        dfs(grid, row, col - 1);

        dfs(grid, row, col + 1);
    }
}