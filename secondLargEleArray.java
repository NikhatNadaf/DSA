
public class secondLargEleArray 
{
    public static int secondLarg(int[] arr)
    {
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            if((arr[i]<l) && (arr[i]>sl))
            {
                sl=arr[i];
            }
        }
        return sl;
    }
    //TC:O(N)
    public static void main(String[] args) {
        int[] a={1,9,5,55,8};
        System.out.println("second largest element: "+secondLarg(a));
    }
    
}
