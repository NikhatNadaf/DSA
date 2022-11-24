
public class rotateArrayInplace 
{
    public static void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int k=3;
        int n=a.length;
        k=k%n;
        reverse(a, 0, n-k-1);
        reverse(a, n-k, n-1);
        reverse(a, 0, n-1);
        
        System.out.println("After rotation");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        //TC:O(N)
        //SC:O(1)
    }
    
}
