
import java.util.Scanner;


public class noOfDigitsinFactorial 
{
    
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Demo d=new Demo();
         System.out.println(d.digitsInFactorial(n));
               
    }
    
}
class Demo
{
     public int digitsInFactorial(int N)
    {
        long fact=1;
        for(int i=1;i<=N;i++)
        {
            fact *= i;
        }
        System.out.println("fact: "+fact);
        int count=(int) Math.log10(fact)+1;
        
        return count;
        // code here
    }
}
