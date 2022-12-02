
public class leftRotateDEfficient 
{
     public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
     public  static void reverse(int[] arr,int l,int r)
     {
         while(l<r)
         {
             int temp=arr[l];
             arr[l]=arr[r];
             arr[r]=temp;
             l++;
             r--;
         }
     }
     public static void leftrotate(int[] arr,int d)
     {
         int n=arr.length;
         reverse(arr,0,d-1);
         reverse(arr,d,n-1);
         reverse(arr,0,n-1);
     }
     //TC:O(N)
     //SP:O(1)
     public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
         printArr(a);
         leftrotate(a,3);
         printArr(a);
    }
    
}
