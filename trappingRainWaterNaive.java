
public class trappingRainWaterNaive 
{
    public static int lmax(int[] arr,int m)
    {
        
        int max=0;
        for(int i=m;i>=0;i--)
        {
            if(arr[i]>max)
                max=arr[i];
            
        }
        return max;
    }
     public static int rmax(int[] arr,int m)
     {
         int n=arr.length;
         int max=0;
         for(int i=m;i<n;i++)
         {
             if(arr[i]>max)
                max=arr[i];
             
         }
         return max;
         
     }
    
    public static int totalWater(int[] arr)
    {
        int n=arr.length;
        int tw=0;
        for(int i=1;i<n-1;i++)
        {
            int lm=lmax(arr,arr[i]);
            int rm=rmax(arr,arr[i]);
            int minm=Math.min(lm,rm);
            tw+=(minm-arr[i]);
        }
        return tw;
    }
    public static void main(String[] args) {
        int[] a={3,1,2,0,2,0,2,4};
        System.out.println("total water: "+totalWater(a));
        //TC:O(N*N)
    }
    
}
