
import java.util.Scanner;


public class FirstUnsetbit 
{
    public static int FirstunsetBit(int n)
    {
        int p=0;
        while(n>0)
        {
            if((n&1)==0)
            {
                p++;
                break;
            }
            p++;
            n=n>>1;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         System.out.println(FirstunsetBit(a));
    }
    
}
