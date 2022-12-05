
import java.util.Arrays;


public class meanAndMedianinArray 
{
   //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
        }
        return sum/N;
       
    }
    /*
    mean--->sum of all elements / total no of elements(lenght of array)
    */
    public static int median(int A[],int N)
    {
      
       Arrays.sort(A);
       int median=0;
       if(N%2==0)
       {
           median=N/2;
           return ((A[median]+A[median-1])/2);
       }
       /*
       if N is even--->median=a[N/2];
       */
       else
       {
           median=N/2;
           return A[median];
       }
       /*
       if N is odd--->median=a[N/2]+a[N/2-1] / 2
       */
       //return median;
       
       
       //If median is fraction then conver it to integer and return
    }
    public static void main(String[] args) {
        int[] a={1, 2, 19, 28, 5};
        int n=a.length;
        System.out.println(mean(a, n)+"  "+median(a, n));
        
        
    }
    
}
