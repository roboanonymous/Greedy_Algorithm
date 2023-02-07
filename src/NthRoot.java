import static java.lang.Math.pow;

public class NthRoot {

    public static float solution(float x, float y, float start , float end )
    {
        if(start == end)
        {
            return start;
        }
        float mid = (start + end)/2;
        double sol = pow(mid, y);
        int sol2 = (int)sol;
        System.out.println(mid + "   " + sol);
        if(sol2 == x)
        {
            return mid;
        }
        else if (sol > x)
        {
            return solution(x, y ,0, mid);
        }

        else
        {
            return solution(x, y , mid, end);
        }




    }
    public static void main (String[] args)
    {
        System.out.println("Hello World");
        float m=69;
        float n=4;
        float ans = solution(m, n ,0, m);
        System.out.println(ans);
    }
}
