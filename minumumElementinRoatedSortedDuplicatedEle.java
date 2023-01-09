/*
 org array : [1,1,2,3,3,4,5]
 rotated array : [1,2,3,3,4,5,1]
 minimum ele: 1
 */
public class minumumElementinRoatedSortedDuplicatedEle 
{
    public static int findmin(int[] arr,int n)
    {
        int l=0,h=n-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(arr[mid]<arr[h])
            {
                h=mid;
            }
            else if(arr[mid]>arr[h])
            {
                l=mid+1;
            }
            else
                h--;
        }
        return arr[l];
    }
    
    public static void main(String[] args) {
        int[] a={1,0,0,1};
        int n=a.length;
        System.out.println(findmin(a, n));
    }
    
}
