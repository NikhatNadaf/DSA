
public class EquilibriumEff
{
    public static int Eqpoint(int[] arr)
    {
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++)
            totalSum+=arr[i];
        int pref=0;
        for(int i=0;i<n;i++)
        {
            pref+=arr[i];
            int rs=totalSum-pref;
            int lf=pref-arr[i];
            if(lf==rs)
                return arr[i];
                
                
        }
        return -1;
    }
    //TC:O(N)
    //SP:O(1)
    public static void main(String[] args) {
        int[] arr={3,4,8,-9,9,7};
        System.out.println(Eqpoint(arr));
    }
    
}
