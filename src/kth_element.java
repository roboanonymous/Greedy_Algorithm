public class kth_element {

    public static int kelement(int[] arr1, int[] arr2, int k)
    {
        int m = arr1.length;
        int n = arr2.length;
        int low = Math.max(0,k-m), high = Math.min(k,n);
        while (low <= high)
        {
            int cut1 = (low + high) >> 1;
            int cut2 = k - cut1;
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            else if (l1 > r2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }

        }
        return  0;
    }

    public static void main (String[] args)
    {
        System.out.println("Hello World");

        int arr1[] = {100, 112, 256, 349, 770};
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

       int ans = kelement(arr1, arr2, k);
        System.out.println(ans);
    }
}
