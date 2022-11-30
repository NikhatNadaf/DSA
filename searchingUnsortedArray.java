
public class searchingUnsortedArray
{
    public static boolean search(int[] arr,int val)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,22,5,3,7,54,68,9,30};
        System.out.println(search(a,300)); //TC:O(N)..unsorted array...Linear search
    }
    
}
