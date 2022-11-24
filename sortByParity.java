
public class sortByParity 
{
     public static void swap(int a[],int l,int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8}; //keep all even at starting and all odd at ending
        //2,4,6,8,1,3,5,7.....output   these orer may change for even/odd number
        int n=a.length;
        int l=0,r=n-1;
        while(l<r)
        {
            if(((a[l]%2)==1) && ((a[r]%2==0)))
            {
                swap(a,l,r);
                l++;
                r--;
            }
            if(a[l]%2==0)
            {
                l++;
            }
            if(a[r]%2==1)
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
