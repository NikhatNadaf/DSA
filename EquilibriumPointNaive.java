
public class EquilibriumPointNaive 
{
    //Array has Equilibrium point or not
    public static int ispoint(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int ls=0,rs=0;
            for(int j=0;j<i;j++)
                ls+=arr[j];//produce left sum
            for(int k=i+1;k<n;k++)
                rs+=arr[k];//produce right sum
            if(ls==rs)
            return arr[i];
        }
        return -1;
        
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] a={3,4,8,-9,9,7};
        System.out.println(ispoint(a));
    }
    
}
