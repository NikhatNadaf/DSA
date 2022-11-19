
import java.util.Scanner;


public class SecondUnsetbit 
{
     public static int Secondunsetbit(int n)
    {
        int p=0;
        int count=0;
        while(n!=0)
        {
            if((n&1)==1)
            {
                p++;
                count++;
            }
            else
                p++;
            if(count>1)
                break;
            
            n=n>>1;
        }
         return p;
        
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         System.out.println(Secondunsetbit(a));
    }
    
}
