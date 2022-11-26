
public class prefixSum 
{
    public static void printAryy(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
    }
    public static void main(String[] args) {
        int[] a={2,1,3,4,5};
        int n=a.length;
        int[] prefsum=new int[n];
        int j=1;
        prefsum[0]=a[0];
        for(int i=1;i<n;i++)
        {
            prefsum[j++]=prefsum[i-1]+a[i];
        }
        //TC:O(N)
        //SP;O(N)
        printAryy(a);
        System.out.println("prefixSum Array");
        printAryy(prefsum);
        
    }
    
}
