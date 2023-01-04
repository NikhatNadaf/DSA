
//import static BinarySearchIndexofFirstOcc.fisrtOcc;


public class BinarySearchCountOccu 
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
     
      public static int lastOcc(int[] arr,int x)
    {
        int n=arr.length;
        int l=0,h=n-1;
        int last=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
            {
                last=mid;
                l=mid+1;
            }
            else if(arr[mid]>x)
            {
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return last;
        
    }
    public static int totalCount(int[] arr,int x)
    {
        int f=fisrtOcc(arr,x);
        int l=lastOcc(arr, x);
        return (l-f)+1;
    }
    
    public static void main(String[] args) {
        int[] a={1,1,1,1,2,3,4,};
        System.out.println(totalCount(a,1));
    }
}
