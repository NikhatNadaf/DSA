
public class maxSubArraySumNaiv 
{
    public static int maxSum(int[] arr)
    {
        int n=arr.length;
        
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                 maxi=Math.max(maxi,sum);
            }
           
        }
        return maxi;
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] a={5,8,3};
        System.out.println(maxSum(a));
    }
    
}
