
import java.util.Arrays;


public class SmallestPositivemissingnumber 
{
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int miss = 0;
        int larg=arr[arr.length-1];
        System.out.println(larg);
        for(int i=1;i<larg;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=i)
                {
                    miss=i;
                    
                }
            }
        }
        return miss;
    }
    public static void main(String[] args) {
        int N = 5;
int arr[] = {1,2,3,6,5};
        System.out.println(missingNumber(arr, N));
    }
    
}
