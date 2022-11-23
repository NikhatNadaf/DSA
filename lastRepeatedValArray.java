
public class lastRepeatedValArray 
{
    public static int lastRepeated(int[] arr,int n)
    {
        int last=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    last=arr[i];
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4,6};
        int n=arr.length;
        System.out.println(lastRepeated(arr, n)); //TC:O(N*N-1)
    }
    
}
