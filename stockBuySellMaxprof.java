
public class stockBuySellMaxprof
{
    public static int maxProf(int[] arr)
    {
        int prof=0;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                prof += (arr[i]-arr[i-1]);
        }
        return prof;
    }
    //TC:O(N)
    public static void main(String[] args) {
        int[] a={5,2,6,1,4,7,3,6};
        System.out.println(maxProf(a));
    }
    
}
