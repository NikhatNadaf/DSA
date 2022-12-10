
public class subarrayWithgivenSum 
{
    public static boolean isContain(int[] arr,int sum)
    {
        int cs=0;
        int n=arr.length;
        int l=0,r=0;
        for(;r<n;r++)
        {
            cs+=arr[r];
            while(sum<cs)
            {
                cs-=arr[l];
                l++;
            }
            if(cs==sum)
                return true;
            
        }
        return false;
            
    }//TC:O(N)
    //
    public static void main(String[] args) {
        int[] a={1,4,20,3,10};
        System.out.println(isContain(a,33));
    }
    
}
