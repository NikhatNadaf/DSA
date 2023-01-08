
public class BinarySearchSquareRoot 
{
    public static int sqrRoot(int n)
    {
        int root=0;
        int l=1;
        int h=n;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int sqr=mid*mid;
            if(sqr<=n)
            {
                root=mid;
                l=mid+1;
                
            }
            else
                h=mid-1;
            
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println(sqrRoot(25));
    }
    
}
