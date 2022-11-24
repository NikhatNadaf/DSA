
public class reverseArray 
{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;
        int[] ans=new int[n]; //using ne array
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            ans[j++]=a[i];
        }
        System.out.println("reversed array");
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        //TC:O(N)
        //SC:O(N)
    }
    
}
