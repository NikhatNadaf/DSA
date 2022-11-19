
import java.util.Scanner;

class InvalidageException extends RuntimeException
{
    InvalidageException(String str)
    {
        super(str);
    }
}
public class userdefinedExcpInvalidAge 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            throw new InvalidageException("Age should be greater than 18");
        }
        else
        {
            System.out.println("you r eligible");
        }
    }
    
}
