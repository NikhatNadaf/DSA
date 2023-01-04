
public class RecurssionIndexofLasrOcc 
{
    static int last=-1;
    public static int lastOcc(int[] arr,int x,int l,int h)
    {
        if(l>h) return last;
        int mid=(l+h)/2;
        if(arr[mid]==x)
        {
            last=mid;
            return lastOcc(arr, x,mid+1, h);
                    
        }
        else if(arr[mid]>x)
            return lastOcc(arr, x, l,mid-1);
        return lastOcc(arr, x,mid+1, h);
    }
    
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,3,4,4,4};
        System.out.println(lastOcc(a,4,0,a.length-1));
    }    
}
