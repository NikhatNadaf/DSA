
public class suffixSumArrayInplace 
{
     public static int[] suffixSum(int[] arr)
    {
        int n=arr.length;
        for(int i=n-2;i>=0;i--)//traversing in reverse form
        {
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    //TC:O(N)
    //SP:O(1)
      public static void main(String[] args) {
        int[] a={1,9,5,12,6,2};
        int[] ans=suffixSum(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
