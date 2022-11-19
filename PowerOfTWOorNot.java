
import java.util.Scanner;


public class PowerOfTWOorNot 
{
    public static boolean isPwerOftwo(int n)
    {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPwerOftwo(a));
    }
    
}
