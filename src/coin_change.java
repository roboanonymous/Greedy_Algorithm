import java.util.ArrayList;

public class coin_change {

    public static void main(String[] args) {

        int n = 350;
        System.out.print(
                "Following is minimal number "
                        +"of change for " + n + ": ");
        int deno[] = {1, 2, 5, 10, 20,
                50, 100, 500, 1000};
        int length = deno.length;

        ArrayList <Integer> ans = new ArrayList<>();
        for(int i= length-1 ; i>=0 ; i--)
        {
            while(n>= deno[i])
            {
                n = n-deno[i];
                ans.add(deno[i]);
            }
        }

        System.out.println(ans);
    }
}
