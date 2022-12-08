
public class maxSumArrayEff 
{
    public static int maxSum(int[] arr)
    {
        int n=arr.length;
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)
                sum=0;
        }
        return maxi;
    }
    //TC:O(N)
    public static void main(String[] args)
    {
        int[] arr={-5,4,6,-3,4,-1};
        System.out.println(maxSum(arr));
    }
    
}
