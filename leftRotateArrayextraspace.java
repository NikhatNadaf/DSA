
public class leftRotateArrayextraspace 
{
     public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
     public static int[] leftRotate(int[] arr,int d)
     {
         int n=arr.length;
         int[] temp=new int[n];
         int j=0;
         for(int i=d;i<n;i++)
         {
             temp[j++]=arr[i];
         }
         for(int i=0;i<d;i++)
         {
             temp[j++]=arr[i];
         }
         return temp;
     }
     //TC:O(N)
     //SP:O(N)
     public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
         printArr(a);
         int[] ans=leftRotate(a,3);
         printArr(ans);
    }
    
}
