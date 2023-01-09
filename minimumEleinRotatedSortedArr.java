
public class minimumEleinRotatedSortedArr 
{
    public static int findMin(int[] arr,int n)
    {
        int l=0;
        int h=n-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(arr[mid]<arr[h])
            {
                h=mid;
            }
            else
                l=mid+1;
        }
        return arr[l];
    }
    
    public static void main(String[] args) {
        int[] a={5,6,2,3,4};
        int n=a.length;
        System.out.println(findMin(a, n));
    }
    
}
