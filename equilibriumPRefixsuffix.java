
public class equilibriumPRefixsuffix 
{
    //finding Equilibriumpoint using prefixsum array and suffixsum arra
    public static int ispoint(int[] arr)
    {
        int n=arr.length;
        //prefix sumarray
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pref[i]=pref[i-1]+arr[i];
        }
        
        //suffix sumarray
        int[] suff=new int[n];
        suff[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suff[i]=suff[i+1]+arr[i];
        }
        
        //checks for array element
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
              
             if(suff[i+1]==0)
                return arr[0];
                
            }
            else if(i==n-1)
            {
                if(pref[i-1]==0)
                   return arr[n-1];
            }
            
            else if(pref[i-1]==suff[i+1])
                return arr[i];
        }
        return -1;
    }
    //TC:O(N)
    //sC:O(N*N)
    public static void main(String[] args) {
        int[] a={3,4,8,-9,9,7};
        System.out.println(ispoint(a));
    }
    
}
