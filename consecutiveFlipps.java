
public class consecutiveFlipps 
{
    public static void miniFlips(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]!=arr[0])
                    System.out.println("From "+i);
                else
                    System.out.println("to "+(i-1));
            }
             if(arr[0]!=arr[n-1])
            System.out.println("to "+(i-1));
            
                
        }
       
            
    }
    //TC:O(N)
    //SP:O(1)
    public static void main(String[] args) {
        int[] arr={1,1,0,0,0,1};
        int n=arr.length;
        miniFlips(arr, n);
    }
    
}
