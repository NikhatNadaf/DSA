
public class reverseArrayUsingSwap 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int i=n-1;
        int j=0;
        //two pointer approach
        //swaping process
        while(i>j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i--;
            j++;
        }
        System.out.println("reversed array");
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    //TC:O(N)
    //SP:O(1)
}
