
public class tripletsSumEqualtoX 
{
    public static int tripletsSum(int[] arr,int x)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        System.out.println(tripletsSum(arr,12)); //TC:O(N*N-1*N-2)
    }
    
}
