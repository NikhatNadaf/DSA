
public class isSortedEffDesc 
{
    public static boolean isSorted(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                return false;
        }
        return true;
    }
     public static void main(String[] args) {
        int[] a={100,90,55,22,1};//Descending
        System.out.println(isSorted(a));//TC:O(N)
    }    
}
