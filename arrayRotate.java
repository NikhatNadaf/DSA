
public class arrayRotate 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        int k=2; //rotate array by k steps
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=a[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=a[i];
        }
        System.out.println("After rotation");
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        //TC:O(N)
        //SC:O(N)
    }
    
}
