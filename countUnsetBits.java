
import java.util.Scanner;


public class countUnsetBits 
{
    public static int countUnSetbits(int n)
    {
        int count=0;
        while(n!=0)
        {
            if((n&1)==0)
            {
                count++;
            }
            n=n>>1;
        }
        return count; //returns no of 0's in number
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(countUnSetbits(a));
    }
    
}
