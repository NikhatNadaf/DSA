
public class BinarySEarchSquareRoot 
{
    public static int srtRoot(int n)
    {
        int l=0,h=n/2;
        int root=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int sqr=mid*mid;
            if(sqr==n)
            {
                root=mid;
            }
            else if(sqr>n)
            {
                h=mid-1;
            }
            else 
            {
                l=mid+1;
                root=mid;
            }
            
        }
        return root;
    }
    
    public static void main(String[] args) {
        System.out.println(srtRoot(16));
    }
    
}
