
public class WaveArray 
{
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void convertToWave(int n, int[] a) 
    {
        for(int i=0;i<n-1;i=i+2)
        {
            swap(a,i,i+1);
        }
        
    }
    //TC:O(N)
    //SP:O(1)
    //Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
    
    
}
