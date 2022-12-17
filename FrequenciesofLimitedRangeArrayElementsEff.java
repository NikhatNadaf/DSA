
import java.util.Arrays;


public class FrequenciesofLimitedRangeArrayElementsEff 
{
    public static void print(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        
        }
        System.out.println("");
        
    }
   
    //without using extra space
    public static void frequencyCount(int[] arr,int N,int P)
    {
        //int n=arr.length;
        int maxi = Math.max(P,N);
        int count[] = new int[maxi+1];
        Arrays.fill(count, 0);
        for(int i=0;i<N;i++){
            count[arr[i]]++; 
        }
        
        for(int i=0;i<N;i++){
            arr[i] = count[i+1];
        }

    }
    public static void main(String[] args) 
    {
        int N =5;
       int[] arr = {2,4,5,6,8};
        int P = 10;
        frequencyCount(arr, N, P);
        print(arr);
        
        
    }
    
    
}
