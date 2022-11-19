
import java.util.Scanner;


public class primeFactors 
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
    } //TC: O(root n)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i*i<a;i++) //if i<a then TC O(n)    //i*i<a then TC O(square root n)
        {
            if(a%i==0)
            {
                if(isPrime(i))
                {
                    System.out.println(i);
                }
            }
            
        }
    }
    
}
