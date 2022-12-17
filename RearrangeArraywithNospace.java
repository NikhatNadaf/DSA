
public class RearrangeArraywithNospace 
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
    static void arrange(int arr[], int n)
    {
        int me=arr[n-1]+1;
        int maxi=n-1;
        int mini=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+((arr[maxi]%me)*me);
                maxi--;
            }
            else
            {
                arr[i]=arr[i]+((arr[mini]%me)*me);
                mini++;
                
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=(arr[i]/me);
        }
        
        // your code here
    }
    //TC:O(N)
    //SP:O(1)
    public static void main(String[] args) {
        int[] arr = {0,1};
         print(arr);
         arrange(arr,arr.length);
         print(arr);
    }
    
}
