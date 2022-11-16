
import java.util.Scanner;


public class clearIthbit 
{
    public static int cleariThbit(int n,int i)
    {
        int bm=~(1<<i);
        return n & bm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=sc.nextInt();
         System.out.println(cleariThbit(a, i));
    }
    
}
