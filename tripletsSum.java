/*
 [1,2,3,4,5,6,7]
 x=10
op: true  (1,2,7)
TC:O(N*N)
 */
public class tripletsSum 
{
    public static void isPair(int[] arr,int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            int l=i+1,h=n-2;
            while(l<=h)
            {
                int sum=arr[i]+arr[l]+arr[h];
                if(sum==x)
                {
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[h]);
                    return; //it print only one pair
                }
                    
                else if(sum>x)
                    h--;
                else
                    l++;
            }
        }
        System.out.println("-1");
    }
    
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int n=a.length;
        int x=10;
        //System.out.println(isPair(a, n, x));
        isPair(a, n, x);
    }
    
}
