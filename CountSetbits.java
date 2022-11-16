
import java.util.Scanner;


public class CountSetbits 
{
    public static int CountSetbits(int n){
        int count=0;
        while(n!=0)
        {
            if((n & 1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(CountSetbits(a));
    }
    
}
