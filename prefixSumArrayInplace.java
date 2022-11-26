
public class prefixSumArrayInplace 
{
    public static void printAryy(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
    }
    public static void main(String[] args) 
    {
        int[] a={2,1,3,4,5};
        int n=a.length;
        printAryy(a);
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+a[i];
        }
        //TC:O(N)
        //SP:O(1)
        System.out.println("prefixSum Array...");
        printAryy(a);
        
    }
}
