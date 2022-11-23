
public class firstRepeatedValArray 
{
    public static int firstRepeated(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4};
        int n=arr.length;
        System.out.println(firstRepeated(arr, n)); //TC:O(N*N-1)
    }
    
}
