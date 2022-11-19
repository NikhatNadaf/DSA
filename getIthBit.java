
import java.util.Scanner;


public class getIthBit 
{
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=sc.nextInt();
         System.out.println(getithbit(a,i));
    }
    
}
