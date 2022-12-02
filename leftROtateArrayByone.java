
public class leftROtateArrayByone 
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
     }
     //TC:O(N)
     //SP:O(1)
     public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
         printArr(a);
         leftRotate(a);
         printArr(a);
    }
    
}
