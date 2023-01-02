
public class reverseAnArray 
{
    public static void reverse(int[] arr,int i)
    {
        if(i<0) return;
        System.out.print(arr[i]+" ");
        reverse(arr,i-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length-1;
        reverse(arr, n);
    }
    
}
