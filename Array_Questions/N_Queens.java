import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {
    private List<String> constructList(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    // 🛡️ Check if placing a queen at (row, col) is safe
    private boolean doesnotCollide(int row, int col, int n, char[][] board) {
        int cRow = row, cCol = col;

        // ⬅️ Check same row to the left
        while (cCol >= 0) {
            if (board[cRow][cCol] == 'Q') return false;
            cCol--;
        }

        // ↖️ Check upper-left diagonal
        cRow = row;
        cCol = col;
        while (cRow >= 0 && cCol >= 0) {
            if (board[cRow][cCol] == 'Q') return false;
            cRow--;
            cCol--;
        }

        // ↙️ Check lower-left diagonal
        cRow = row;
        cCol = col;
        while (cRow < n && cCol >= 0) {
            if (board[cRow][cCol] == 'Q') return false;
            cRow++;
            cCol--;
        }

        return true;
    }

    // 🔁 Backtracking function
    private void solve(int col, int n, char[][] board, List<List<String>> ans) {
        if (col == n) {
            ans.add(constructList(board)); // 🎯 Valid board
            return;
        }

        for (int row = 0; row < n; row++) {
            if (doesnotCollide(row, col, n, board)) {
                board[row][col] = 'Q';        // 👑 Place queen
                solve(col + 1, n, board, ans);
                board[row][col] = '.';        // ↩️ Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');      // 🧼 Initialize

        solve(0, n, board, ans);
        return ans;
    }

    public static void main(String[] args) {
        N_Queens nq = new N_Queens();
        int n = 4; // try with different sizes
        List<List<String>> solutions = nq.solveNQueens(n);

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
