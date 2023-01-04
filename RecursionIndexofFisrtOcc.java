
public class RecursionIndexofFisrtOcc 
{
    static int first=-1;
    public static int firstOcc(int[] arr,int x,int l,int h)
    {
        if(l>h) return first;
        int mid=(l+h)/2;
        if(arr[mid]==x)
        {
            first=mid;
            return firstOcc(arr, x, l,mid-1);
            
        }
        else if(arr[mid]>x)
            return firstOcc(arr, x, l,mid-1);
        return firstOcc(arr, x, mid+1, h);
                    
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,3,4,4,4};
        System.out.println(firstOcc(a,3,0,a.length-1));
    }
    
}
