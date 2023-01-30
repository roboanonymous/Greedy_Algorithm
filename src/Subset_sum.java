import java.util.ArrayList;
import java.util.Collections;

public class Subset_sum {

    public static void subsetSumsHelper (int ind, int sum, int[] arr, int N, ArrayList < Integer > sumSubset)
    {
        if(ind == N)
        {
            sumSubset.add(sum);
            return;
        }

        subsetSumsHelper(ind+1,  sum + arr[ind], arr, N , sumSubset);
        subsetSumsHelper(ind+1,  sum , arr, N , sumSubset);


    }
    public static ArrayList<Integer> sum (int[] arr , int N)
    {
        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public static void main (String[] args)
    {
        System.out.println("Hello World!");
        int n = 2;
        int[] arr = {2,3};
        ArrayList <Integer> ans = new ArrayList<>();
        ans = sum(arr,n);
        System.out.println(ans);
    }
}
