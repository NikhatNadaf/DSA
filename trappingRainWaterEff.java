
public class trappingRainWaterEff 
{
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static int[] maxLeft(int[] arr)
    {
        int n=arr.length;
        int[] ml=new int[n];
        ml[0]=0;
        for(int i=1;i<n;i++)
        {
            ml[i]=Math.max(arr[i-1],ml[i-1]);
        }
        return ml;
    }//it's store all left max value for arr[i]
    public static int[] maxRight(int[] arr)
    {
        int n=arr.length;
        int[] mR=new int[n];
        mR[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            mR[i]=Math.max(arr[i+1],mR[i+1]);
        }
        return mR;
        
    }//it's store all right max value for arr[i]
    public static int totalwater(int[] arr)
    {
        int n=arr.length;
        int[] lm=maxLeft(arr);
        int[] rm=maxRight(arr);
        int tw=0;
        for(int i=1;i<n-1;i++)
        {
            tw+= (Math.min(lm[i],rm[i]))-arr[i];
        }
        return tw;
    }
    public static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};
        System.out.println(totalwater(arr));
        //TC:O(N)
        //SP:O(N)
       
        
    }
    
}
