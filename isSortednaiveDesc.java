


public class isSortednaiveDesc 
{
    public static boolean isSorted(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                    return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        int[] a={100,90,80,70,60};//Descending
        System.out.println(isSorted(a));//TC:O(N*N)
    }
    
}
