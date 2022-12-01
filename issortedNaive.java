
public class issortedNaive 
{
    public static boolean isSorted(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={19,20,25,30,45,47,10};//Ascending
        System.out.println(isSorted(a));//TC:O(N*N)
    }
    
}
