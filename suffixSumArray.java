
public class suffixSumArray
{
    public static int[] suffixSum(int[] arr)
    {
        int n=arr.length;
        int[] suf=new int[n];
        suf[n-1]=arr[n-1];
        int j=n-2;
        for(int i=n-2;i>=0;i--)//traversing in reverse form
        {
            suf[j--]=arr[i]+suf[i+1];
        }
        return suf;
    }
    //TC:O(N)
    //SP:O(N)
    public static void main(String[] args) {
        int[] a={1,9,5,12,6,2};
        int[] ans=suffixSum(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
