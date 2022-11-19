
import java.util.Scanner;


public class finallyExcp 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=9;
        
        try{
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("for b input should not 0");
        }
        finally
        {
            System.out.println("i am finally blocks");
        }
    }
    
}
