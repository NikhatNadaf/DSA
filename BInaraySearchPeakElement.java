
public class BInaraySearchPeakElement 
{
    public static int findPeak(int[] arr,int n){
        int l=0;
        int h=n-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(arr[mid]>arr[mid+1])
                h=mid;
            else
                l=mid+1;
        }
        return arr[l];
    }
    
    public static void main(String[] args) {
        int[] a={3,8};
        int n=a.length;
        System.out.println(findPeak(a, n));
    }
    
}
