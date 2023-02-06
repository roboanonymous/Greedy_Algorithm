import java.io.LineNumberInputStream;
import java.util.ArrayList;

public class RatMaze {

    public static void recursion (int n, int[][] matrix , ArrayList <String> ans )
    {
        return;

    }

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int n = 4;
        int[][] matrix ={{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        ArrayList <String> ans = null;
        recursion (n, matrix, ans);

        System.out.println(ans);
    }
}
