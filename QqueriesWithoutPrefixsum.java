
import java.util.Scanner;


public class QqueriesWithoutPrefixsum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a={0,6,2,8,1,7,5};
        System.out.println("Enter the noof querie");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.println("Enter range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=0;
            for(int i=l;i<=r;i++)
            {
                 sum += a[i];
            }
            System.out.println("Sum; "+sum);
            q--;
        }
        // TC:(Q*N)
    }
    
}
