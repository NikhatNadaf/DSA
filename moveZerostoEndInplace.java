
public class moveZerostoEndInplace 
{
     public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void swap(int[] arr,int l,int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void moveZeros(int[] arr)
    {
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if((arr[l]==0) && (arr[r]!=0))
            {
                swap(arr,l,r);
                l++;
                r--;
            }
            if(arr[l]!=0)
                l++;
            if(arr[r]==0)
                r--;
        }
    }
    //  TC:O(N)
    //  SP:O(1)
    public static void main(String[] args) {
        int[] a={0,1,0,3,12,0,5};
        printArr(a);
        moveZeros(a);
        printArr(a);
    }
    
}
