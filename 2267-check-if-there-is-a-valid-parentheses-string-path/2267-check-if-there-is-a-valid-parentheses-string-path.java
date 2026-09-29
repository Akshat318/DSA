class Solution {
    private int m, n;
    private boolean[][][] visited;

    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        if ((m + n - 1) % 2 != 0) return false;
        
 if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') return false;
        
         
        visited = new boolean[m][n][m + n];
        
        return dfs(grid, 0, 0, 0);
    }

    private boolean dfs(char[][] grid, int r, int c, int balance) {
    
        balance += (grid[r][c] == '(') ? 1 : -1;
        
        
        if (balance < 0) return false;
        
        
        if (r == m - 1 && c == n - 1) {
            return balance == 0;
        }
        
        
        if (visited[r][c][balance]) return false;
        visited[r][c][balance] = true;
        
        
        if (r + 1 < m && dfs(grid, r + 1, c, balance)) {
            return true;
        }
        
    
        if (c + 1 < n && dfs(grid, r, c + 1, balance)) {
            return true;
        }
        
        return false;
    }
}
