
import java.util.Scanner;


public class counNumofDigitsWithoutLoop 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         long n=sc.nextLong();
         System.out.println((int) Math.log10(n)+1);
        
    }
    
}
