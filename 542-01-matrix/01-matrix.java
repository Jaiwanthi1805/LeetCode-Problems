import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] dist = new int[m][n];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    queue.add(new int[]{i, j});
                } else {
                    dist[i][j] = -1;
                }
            }
        }
        int[][] directions = {
            {-1, 0},  
            {1, 0},   
            {0, -1},  
            {0, 1}    
        };
        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            for (int k = 0; k < 4; k++) {

                int newRow = row + directions[k][0];
                int newCol = col + directions[k][1];

                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n &&
                    dist[newRow][newCol] == -1) {

                    dist[newRow][newCol] = dist[row][col] + 1;

                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
        return dist;
    }
}