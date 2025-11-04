import java.util.*;

public class ratMaze {

    public static void helper(int[][] mat, int r, int c, String path, List<String> ans) {
        if (r == mat.length - 1 && c == mat[0].length - 1) {
            ans.add(path);
            return;
        }

     
        if (r + 1 < mat.length && mat[r + 1][c] == 1) {
            helper(mat, r + 1, c, path + "D", ans);
        }

     
        if (c + 1 < mat[0].length && mat[r][c + 1] == 1) {
            helper(mat, r, c + 1, path + "R", ans);
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> ans = new ArrayList<>();

        if (mat[0][0] == 1)
            helper(mat, 0, 0, "", ans);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}