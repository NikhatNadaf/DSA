
public class BInarySearchPeakElement 
{
    public static int peakElement(int[] arr,int n)
    {
        int l=0,h=n-1;
        if(n==1) return arr[0];
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((mid>0) && (mid<n))
            {
                if((arr[mid]>=arr[mid-1]) && (arr[mid]>=arr[mid+1]))
                {
                    return arr[mid];
                }
                else if(arr[mid-1]>arr[mid])
                {
                    h=mid-1;
                }
                else
                    l=mid+1;
            }
            else if(mid==0)
            {
                if(arr[0]>=arr[1])
                    return arr[0];
                else
                    return arr[1];
            }
            else
            {
                if(arr[n-1]>arr[n-2])
                    return arr[n-1];
                else
                    return arr[n-2];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) 
    {
        int[] a={10,20,15,5,23,90,6};
        int n=a.length;
        System.out.println(peakElement(a, n));    
    }
    
}
