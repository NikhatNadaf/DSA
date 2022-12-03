
public class maxDiffArrayElementNaive 
{
    public static int maxDiff(int[] arr)
    {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    max=Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        return max;
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] arr={7,9,5,6,13,2};
        System.out.println(maxDiff(arr)); //8--->13-5
    }
    
}
