
public class largestEleArrayNavie 
{
    public static int lar(int[] arr)
    {
        int n=arr.length;
        int large=arr[0];
        int index=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
                 index=i;
            }
        }
        return index;//returning index
    }
    public static void main(String[] args)
    {
        int[] a={5,9,8,17,4,2,20,15};
        
        System.out.println(lar(a));//TC:O(N)
        
    }
    
}
