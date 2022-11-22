
import java.util.Arrays;


public class deepCpyArrayCopyOfmethod 
{
    public static void main(String[] args) 
    {
        int a[]={1,4,7,9};
        int n=a.length;
        int b[]=Arrays.copyOf(a, n);
        b[0]=0;
        System.out.println("original array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("copied array");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        
    }
        
       
}
