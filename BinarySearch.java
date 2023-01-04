
public class BinarySearch 
{
    public static int searchBi(int[] arr,int x)
    {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
            {
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,};
        System.out.println(searchBi(a,9));
        
    }
    
}
