
public class LongestevenOddSubArrayNaive 
{
    public static int subArr(int[] a)
    {
        int n=a.length;
        
        int lng=1;
        for(int i=0;i<n;i++)
        {
            int sts=1;
            
            for(int j=i+1;j<n;j++)
            {
                if(((a[j]%2==0) && (a[j-1]%2==1)) || ((a[j]%2==1) && (a[j-1]%2==0)))
                {
                    sts++;
                }
                else
                    break;
            }
            lng=Math.max(sts,lng);
            
        }
        return lng;
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] arr={5,5,18,20};
        System.out.println(subArr(arr));
    }
    
}
