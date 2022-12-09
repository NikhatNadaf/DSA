
public class slidingWindowNaive
{
    //maximum sum of k consecutive elements
    public static int maxSum(int[] arr,int k)
    {
        int n=arr.length;
        int maxi=0;
        for(int i=0;i+k-1<n;i++)
        {
            int sum=0;
            for(int j=0;j<k;j++)
                sum+=arr[i+j];
             maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
    //TC:O(N*K)
    public static void main(String[] args) {
        int[] a={5,-10,6,90,3};
        System.out.println(maxSum(a,2));
    }
    
}
