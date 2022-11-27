
import java.util.Scanner;


public class QqueriesUsinprefixsumArry 
{
    public static int[] prefixSumArr(int[] arr)
    {
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        int j=1;
        for(int i=1;i<arr.length;i++)
        {
            ans[j++]=ans[i-1]+arr[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a={0,6,2,8,1,7,5};
        int[] pfs=prefixSumArr(a);
    
        System.out.println("Enter the noof querie");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("Enter range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=pfs[r]-pfs[l-1];
            System.out.println("Sum: "+sum);
        
    }
    
}
}
