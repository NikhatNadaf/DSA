
public class sortZerosOnesArray 
{
    public static void swap(int a[],int l,int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void main(String[] args) {
        int[] a={1,1,0,1,0,0,1,0,1,1,0,0};
        int n=a.length;
        int l=0,r=n-1; //two pointer approach
        while(l<r)
        {
            if((a[l]==1) && (a[r]==0))
            {
                swap(a,l,r);
                l++;
                r--;
            }
            if(a[l]==0)
            {
                l++;
                
            }
            if(a[r]==1)
            {
                r--;
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        
    }
    
}
