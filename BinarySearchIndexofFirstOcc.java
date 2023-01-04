
public class BinarySearchIndexofFirstOcc 
{
    public static int fisrtOcc(int[] arr,int x)
    {
        int n=arr.length;
        int l=0,h=n-1;
        int fo=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
            {
                fo=mid;
                h=mid-1;
            }
            else if(arr[mid]>x)
            {
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return fo;
        
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,3,4,4,4};
        System.out.println(fisrtOcc(a,4));
    }
    
}
