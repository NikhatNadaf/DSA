
public class sumEqualtoX 
{
    public static int Sum(int[] arr,int x)
    {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,6,5,4};
        System.out.println(Sum(arr,7)); //TC:O(N*N-1)
    }
    
}
