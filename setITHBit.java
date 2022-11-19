
import java.util.Scanner;


public class setITHBit 
{
    public static int setIthBit(int n,int i)
    {
        int bitmask=1<<i;
        return n| bitmask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=sc.nextInt();
         System.out.println(setIthBit(a, i));
    }
    
}
