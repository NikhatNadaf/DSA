
public class isSortedEff 
{
    public static boolean isSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }
     public static void main(String[] args) {
        int[] a={19,20,23,33,45,48,55};//Ascending
        System.out.println(isSorted(a));//TC:O(N)
    }
}
