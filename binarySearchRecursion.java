
public class binarySearchRecursion 
{
    public static int binary(int[] arr,int x,int l,int h)
    {
        if(l>h) return -1;
        int mid=(l+h)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x)
            return binary(arr,x,l,mid-1);
        return binary(arr, x, mid+1, h);
        
    }
    
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6,7,8,};
        System.out.println(binary(a,9,0,a.length-1));
        
    }
    
}
