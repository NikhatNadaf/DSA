/*
 searching in sorted roatated array
 */
public class BInarySearchsearchingInsortedROtatedArray 
{
    public static int search(int[] arr,int x)
    {
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
                return mid;
            
            //check left part is sorted 
            if(arr[l]<arr[mid])
            {
                if((x>=arr[l]) && (x<arr[mid]))
                {
                    h=mid+1;
                }
                else
                    l=mid-1;
            }
            
            //come in right sorted part
            else
            {
                if((x>arr[mid]) && (x<=arr[h]))
                {
                    l=mid+1;
                }
                else
                    h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(search(arr,1));
    }
    
}
