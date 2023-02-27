public class Allocate_book {

    public static boolean isPossible (int[] arr, int n, int m, int min)
    {
        int studentreq = 1, sum =0;
        for(int j=0; j<n ; j++)
        {
            if(arr[j] > min)
            {
                return false;
            }

            if(sum+arr[j] > min)
            {
                studentreq++;
                sum = arr[j];
            }
            if(studentreq > m)
            {
                return false;
            }
            else
            {
                sum += arr[j];
            }
        }


        return true;
    }

    public  static int allocateMin(int [] arr, int m)
    {
        int n = arr.length;
        int sum =0;
        if(m>n)
        {
            return -1;
        }
        for(int i=0; i<n; i++)
        {
            sum = sum+arr[i];
        }
        int start = 0, end = sum , ans = Integer.MAX_VALUE;
        while (start <= end)
        {
            int mid = (start+end)/2;
            if(isPossible(arr,n,m,mid ))
            {
                ans = Math.min(ans, mid);
                end = mid-1;

            }

            else
            {
                start = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int A[] = {12, 34, 67, 90};
        int B = 2;
        int ans = allocateMin(A, B);
        System.out.println(ans);

    }
}
