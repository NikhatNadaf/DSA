
public class leftRotateDtimesNaive
{
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
     public static void leftRotate(int[] arr)
     {
         int n=arr.length;
         int temp=arr[0];
         for(int i=1;i<n;i++)
         {
             arr[i-1]=arr[i];
         }
         arr[n-1]=temp;
     }//left rotate by 1 time
     public static void leftRotateDtimes(int[] arr,int d)
     {
         for(int i=0;i<d;i++)
             leftRotate(arr); //call leftRotate D times
     }
    //TC:O(N*D)
     public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
         printArr(a);
         leftRotateDtimes(a,3);
         printArr(a);
    }
}
