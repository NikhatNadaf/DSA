
public class peakElementinArray 
{
    public static int peakElement(int[] arr,int n)
    {
        if(n==1)
            return arr[0];
        else if(arr[n-1]>=arr[n-2])
            return arr[n-1];
        else if(arr[0]>=arr[1])
            return arr[0];
        for(int i=1;i<n-1;i++)
        {
            if((arr[i]>=arr[i-1]) && (arr[i]>=arr[i+1]))
                return arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a={5,10,20,15,7};
        int n=a.length;
        System.out.println(peakElement(a, n));
    }
    //TC:O(N)
}
