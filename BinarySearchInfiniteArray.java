/*
 searching in infinite array
 */
public class BinarySearchInfiniteArray
{
    public static int binarySearch(int[] arr,int x,int l,int h)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static int search(int[] arr,int x)
    {
        if(arr[0]==x) return 0;
        int i=1;
        while(arr[i]<x)
        {
            i =i*2;
        }
        if(arr[i]==x) return i;
        return binarySearch(arr,x,i/2,i);
    }
    
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,30,40};
        System.out.println(search(arr,35));
        
    }
    
}
