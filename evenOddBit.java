
import java.util.Scanner;


public class evenOddBit 
{
    public static void evenOdd(int n)
    {
        if((n & 1)==0)
        {
            System.out.println(n+" is even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
        
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        evenOdd(a); //TC:O(1)
    }

    
}
