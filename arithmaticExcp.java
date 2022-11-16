
public class arithmaticExcp 
{
    public static void main(String[] args) {
        int a=8,b=0;
        try
        {
            int c=a/b;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }
    
}
