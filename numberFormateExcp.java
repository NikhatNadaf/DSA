
public class numberFormateExcp 
{
    public static void main(String[] args) {
       try
       {
           int n=Integer.parseInt("hello");
           System.out.println(n);
       }
       catch(NumberFormatException ne)
       {
           System.out.println(ne);
       }
    }
    
}
