
public class removeDuplctEleArrEff
{
     public static void printArray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static int removeDup(int[] arr)
    {
        int res=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[res]=arr[i];
                res++;
            }
                
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,2,3,4,4,4,5};
        printArray(a,a.length);
        int size=removeDup(a);//TC:O(N)
                     //SP:O(1)
        printArray(a,size);
        
    }
    
}
